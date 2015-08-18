package ca.apm.introscope.webservices;

public class IMetricsDataServiceProxy implements ca.apm.introscope.webservices.IMetricsDataService {
  private String _endpoint = null;
  private ca.apm.introscope.webservices.IMetricsDataService iMetricsDataService = null;
  
  public IMetricsDataServiceProxy() {
    _initIMetricsDataServiceProxy();
  }
  
  public IMetricsDataServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIMetricsDataServiceProxy();
  }
  
  private void _initIMetricsDataServiceProxy() {
    try {
      iMetricsDataService = (new ca.apm.introscope.webservices.MetricsDataServiceLocator()).getMetricsDataService();
      if (iMetricsDataService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iMetricsDataService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iMetricsDataService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iMetricsDataService != null)
      ((javax.xml.rpc.Stub)iMetricsDataService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ca.apm.introscope.webservices.IMetricsDataService getIMetricsDataService() {
    if (iMetricsDataService == null)
      _initIMetricsDataServiceProxy();
    return iMetricsDataService;
  }
  
  public ca.apm.introscope.webservices.TimeslicedMetricDataPerAgentMetric[] getBulkMetricData(ca.apm.introscope.webservices.AgentMetricName[] allMetrics, java.util.Calendar startTime, java.util.Calendar endTime, int dataFrequency) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iMetricsDataService == null)
      _initIMetricsDataServiceProxy();
    return iMetricsDataService.getBulkMetricData(allMetrics, startTime, endTime, dataFrequency);
  }
  
  public ca.apm.introscope.webservices.TimeslicedResultSetMetricData[] getLiveMetricData(java.lang.String agentRegex, java.lang.String metricPrefix) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iMetricsDataService == null)
      _initIMetricsDataServiceProxy();
    return iMetricsDataService.getLiveMetricData(agentRegex, metricPrefix);
  }
  
  public ca.apm.introscope.webservices.TimesliceGroupedMetricData[] getTopNMetricData(java.lang.String agentRegex, java.lang.String metricRegex, java.util.Calendar startTime, java.util.Calendar endTime, int dataFrequency, int topNCount, boolean decreasingOrder) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iMetricsDataService == null)
      _initIMetricsDataServiceProxy();
    return iMetricsDataService.getTopNMetricData(agentRegex, metricRegex, startTime, endTime, dataFrequency, topNCount, decreasingOrder);
  }
  
  public ca.apm.introscope.webservices.TimesliceGroupedMetricData[] getMetricData(java.lang.String agentRegex, java.lang.String metricRegex, java.util.Calendar startTime, java.util.Calendar endTime, int dataFrequency) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iMetricsDataService == null)
      _initIMetricsDataServiceProxy();
    return iMetricsDataService.getMetricData(agentRegex, metricRegex, startTime, endTime, dataFrequency);
  }
  
  
}