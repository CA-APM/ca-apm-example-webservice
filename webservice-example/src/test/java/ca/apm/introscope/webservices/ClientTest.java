package ca.apm.introscope.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;

import javax.xml.rpc.ServiceException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ca.wily.introscope.webservices.DMetricData;
import com.ca.wily.introscope.webservices.DTimeslicedResultSetMetricData;
import com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
import com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleAlertDefnSnapshot;
import com.wily.introscope.server.webservicesapi.alerts.ManagementModuleBean;
import com.wily.introscope.webservices.alerts.AlertPollingService;
import com.wily.introscope.webservices.alerts.AlertPollingServiceLocator;
import com.wily.introscope.webservices.alerts.AlertPollingServiceSoapBindingStub;

public class ClientTest {

    private String host = "apm-docker.ca.com";
    private String port = "8081";
    private String protocol = "http";
    private String user = "admin";
    private String pwd = "";
    private String[] agents = {"172.17.0.15|nodejs-probes|Agent(Mathapp-Node)",
    "apm-docker|Docker|DockerAgent"};

    
    @Before
    public void setUp() throws Exception {
        // set up test environment
    }

    @After
    public void tearDown() throws Exception {
        // tear down test environment
    }

    @Test
    public void testMetricsDataService() {
        try {
            URL url = new URL(protocol + "://" + host + ":" + port
                              + "/introscope-web-services/services/MetricsDataService");
            MetricsDataService service = new MetricsDataServiceLocator();
            MetricsDataServiceSoapBindingStub stub = (MetricsDataServiceSoapBindingStub) service.getMetricsDataService(url);

            stub.setUsername(user);
            stub.setPassword(pwd);

            System.out.println("\n\nTesting MetricsDataService\n");

            DTimeslicedResultSetMetricData[] data =
                    stub.getLiveMetricData("(.*)\\|Custom Metric Process \\(Virtual\\)\\|(.*)",
                            "Enterprise Manager:Overall Capacity \\(%\\)");
            DateFormat format = DateFormat.getDateTimeInstance();

            if (null != data) {
                for (int i = 0; i < data.length; ++i) {
                    DMetricData[] m = data[i].getMetricData();
                    for (int j = 0; j < m.length; ++j) {
                        System.out.println(format.format(data[i].getTimesliceStartTime().getTime()) + " - "
                                + format.format(data[i].getTimesliceEndTime().getTime()) + ":\t"
                                + m[j].getAgentName() + "|"
                                + m[j].getMetricName() + " = "
                                + m[j].getMetricValue());
                    }
                }
            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ServiceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void testAlertPollingService() {
        try {
            URL url = new URL(protocol + "://" + host + ":" + port
                              + "/introscope-web-services/services/AlertPollingService");
            AlertPollingService service = new AlertPollingServiceLocator();
            AlertPollingServiceSoapBindingStub stub =(AlertPollingServiceSoapBindingStub) service.getAlertPollingService(url);
            stub.setUsername(user);
            stub.setPassword(pwd);

            System.out.println("\n\nTesting AlertPollingService");

            ManagementModuleBean[] modules = stub.getAllIscopeManagmentModules();
            if (null != modules && modules.length > 0) {
                for (int j = 0; j < modules.length; ++j) {
                    System.out.println("\nFound Management Module " + modules[j].getManModuleName());

                    for (int k = 0; k < agents.length; ++k) {
                        try {
                            DMgmtModuleAlertDefnSnapshot[] alerts = stub.getAlertSnapshots(modules[j].getManModuleName(), agents[k]);
                            if (null != alerts && alerts.length > 0) {
                                for (int i = 0; i < alerts.length; ++i) {
                                    System.out.println(alerts[i].getManModuleName() + "/"
                                            + alerts[i].getAlertIdentifier() + "/"
                                            + alerts[i].getAgentIdentifier() + ":\twarning = "
                                            + alerts[i].getWarningThresholdValue() + ", critical = "
                                            + alerts[i].getCriticalThresholdValue() + ", active = "
                                            + alerts[i].isActive() + ", status = "
                                            + alerts[i].getAlertDefnCurrStatus()
                                            + (alerts[i].getAlertDefnCurrStatus() == 1 ? " OK" :
                                                (alerts[i].getAlertDefnCurrStatus() == 2 ? " Warning" :
                                                    (alerts[i].getAlertDefnCurrStatus() == 3 ? " Danger" :
                                                        (alerts[i].getAlertDefnCurrStatus() == 0 ? " No Data" :
                                                            " Unkown")))));
                                }
                            }
                        } catch (IntroscopeWebServicesException e) {
                            System.out.println("no alert for agent " + agents[k] + " in Management Module " + modules[j].getManModuleName());
                        } catch (RemoteException e) {
                            System.out.println("no alert for agent " + agents[k] + " in Management Module " + modules[j].getManModuleName());
                        }
                    }
                }
            }
//            DAllAlertsSnapshot[] alerts = stub.getAllAlertsSnapshot();
//            if (null != alerts && alerts.length > 0) {
//                for (int i = 0; i < alerts.length; ++i) {
//                    System.out.println(alerts[i].getManModuleName() + "/"
//                                       + alerts[i].getAlertName() + ": "
//                                       + alerts[i].getAlertCurrStatus() + ", "
//                                       + alerts[i].getThresholdValue() + ", "
//                                       + alerts[i].isSimpleAlert());
//                }
//            }

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ServiceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IntroscopeWebServicesException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
