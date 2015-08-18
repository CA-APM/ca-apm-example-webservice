/**
 * IMetricsDataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.apm.introscope.webservices;

public interface IMetricsDataService extends java.rmi.Remote {
    public ca.apm.introscope.webservices.TimeslicedMetricDataPerAgentMetric[] getBulkMetricData(ca.apm.introscope.webservices.AgentMetricName[] allMetrics, java.util.Calendar startTime, java.util.Calendar endTime, int dataFrequency) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public ca.apm.introscope.webservices.TimeslicedResultSetMetricData[] getLiveMetricData(java.lang.String agentRegex, java.lang.String metricPrefix) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public ca.apm.introscope.webservices.TimesliceGroupedMetricData[] getTopNMetricData(java.lang.String agentRegex, java.lang.String metricRegex, java.util.Calendar startTime, java.util.Calendar endTime, int dataFrequency, int topNCount, boolean decreasingOrder) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public ca.apm.introscope.webservices.TimesliceGroupedMetricData[] getMetricData(java.lang.String agentRegex, java.lang.String metricRegex, java.util.Calendar startTime, java.util.Calendar endTime, int dataFrequency) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
}
