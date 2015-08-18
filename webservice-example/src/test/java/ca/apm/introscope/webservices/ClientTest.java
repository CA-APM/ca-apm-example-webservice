package ca.apm.introscope.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;

import javax.xml.rpc.ServiceException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ca.apm.introscope.webservices.MetricData;
import ca.apm.introscope.webservices.MetricsDataService;
import ca.apm.introscope.webservices.MetricsDataServiceLocator;
import ca.apm.introscope.webservices.MetricsDataServiceSoapBindingStub;
import ca.apm.introscope.webservices.TimeslicedResultSetMetricData;

import com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;

public class ClientTest {

    @Before
    public void setUp() throws Exception {
        // set up test environment
    }

    @After
    public void tearDown() throws Exception {
        // tear down test environment
    }
    
    @Test
    public void test() {
        URL url;
        try {
            url = new URL ("http://boot2docker:8081/introscope-web-services/services/MetricsDataService");
            MetricsDataService service = new MetricsDataServiceLocator();
            MetricsDataServiceSoapBindingStub stub = (MetricsDataServiceSoapBindingStub) service.getMetricsDataService(url);

            stub.setUsername("admin");
            stub.setPassword("");

            TimeslicedResultSetMetricData[] data =
                    stub.getLiveMetricData("(.*)\\|Custom Metric Process \\(Virtual\\)\\|(.*)",
                            "Enterprise Manager:Overall Capacity \\(%\\)");

            if (null != data) {
                for (int i = 0; i < data.length; ++i) {
                    MetricData[] m = data[i].getMetricData();
                    DateFormat format = DateFormat.getDateTimeInstance();
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
        } catch (IntroscopeWebServicesException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
