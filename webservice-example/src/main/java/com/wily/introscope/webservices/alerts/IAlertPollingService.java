/**
 * IAlertPollingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wily.introscope.webservices.alerts;

public interface IAlertPollingService extends java.rmi.Remote {
    public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleSnapshot getManagementModule(java.lang.String manModuleName) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public com.wily.introscope.server.webservicesapi.alerts.DEMConfig getEMConfig() throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleAlertDefnSnapshot getAlertSnapshot(java.lang.String manModuleName, java.lang.String agentIdentifier, java.lang.String alertDefName) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleAlertDefnSnapshot[] getAlertSnapshots(java.lang.String manModuleName, java.lang.String agentIdentifier) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleSnapshot[] getManagedModules() throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public com.wily.introscope.server.webservicesapi.alerts.ManagementModuleBean[] getAllIscopeManagmentModules() throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public com.wily.introscope.server.webservicesapi.alerts.ManagementModuleBean[] getAllFilteredIscopeManagmentModules() throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public com.wily.introscope.server.webservicesapi.alerts.DAllAlertsSnapshot[] getAllAlertsSnapshot() throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public com.wily.introscope.server.webservicesapi.alerts.DAllAlertsSnapshot[] getAllAlertsSnapshotForManagementModule(java.lang.String managementModule) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleAgentSnapshot getAgentSnapshot(java.lang.String manModuleName, java.lang.String agentIdentifier) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
    public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleAgentSnapshot[] getAgentSnapshots(java.lang.String manModuleName) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException;
}
