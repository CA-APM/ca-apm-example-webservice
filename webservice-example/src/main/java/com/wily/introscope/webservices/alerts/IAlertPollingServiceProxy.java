package com.wily.introscope.webservices.alerts;

public class IAlertPollingServiceProxy implements com.wily.introscope.webservices.alerts.IAlertPollingService {
  private String _endpoint = null;
  private com.wily.introscope.webservices.alerts.IAlertPollingService iAlertPollingService = null;
  
  public IAlertPollingServiceProxy() {
    _initIAlertPollingServiceProxy();
  }
  
  public IAlertPollingServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIAlertPollingServiceProxy();
  }
  
  private void _initIAlertPollingServiceProxy() {
    try {
      iAlertPollingService = (new com.wily.introscope.webservices.alerts.AlertPollingServiceLocator()).getAlertPollingService();
      if (iAlertPollingService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iAlertPollingService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iAlertPollingService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iAlertPollingService != null)
      ((javax.xml.rpc.Stub)iAlertPollingService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.wily.introscope.webservices.alerts.IAlertPollingService getIAlertPollingService() {
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService;
  }
  
  public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleSnapshot getManagementModule(java.lang.String manModuleName) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService.getManagementModule(manModuleName);
  }
  
  public com.wily.introscope.server.webservicesapi.alerts.DEMConfig getEMConfig() throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService.getEMConfig();
  }
  
  public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleAlertDefnSnapshot getAlertSnapshot(java.lang.String manModuleName, java.lang.String agentIdentifier, java.lang.String alertDefName) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService.getAlertSnapshot(manModuleName, agentIdentifier, alertDefName);
  }
  
  public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleAlertDefnSnapshot[] getAlertSnapshots(java.lang.String manModuleName, java.lang.String agentIdentifier) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService.getAlertSnapshots(manModuleName, agentIdentifier);
  }
  
  public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleSnapshot[] getManagedModules() throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService.getManagedModules();
  }
  
  public com.wily.introscope.server.webservicesapi.alerts.ManagementModuleBean[] getAllIscopeManagmentModules() throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService.getAllIscopeManagmentModules();
  }
  
  public com.wily.introscope.server.webservicesapi.alerts.ManagementModuleBean[] getAllFilteredIscopeManagmentModules() throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService.getAllFilteredIscopeManagmentModules();
  }
  
  public com.wily.introscope.server.webservicesapi.alerts.DAllAlertsSnapshot[] getAllAlertsSnapshot() throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService.getAllAlertsSnapshot();
  }
  
  public com.wily.introscope.server.webservicesapi.alerts.DAllAlertsSnapshot[] getAllAlertsSnapshotForManagementModule(java.lang.String managementModule) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService.getAllAlertsSnapshotForManagementModule(managementModule);
  }
  
  public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleAgentSnapshot getAgentSnapshot(java.lang.String manModuleName, java.lang.String agentIdentifier) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService.getAgentSnapshot(manModuleName, agentIdentifier);
  }
  
  public com.wily.introscope.server.webservicesapi.alerts.DMgmtModuleAgentSnapshot[] getAgentSnapshots(java.lang.String manModuleName) throws java.rmi.RemoteException, com.wily.introscope.server.webservicesapi.IntroscopeWebServicesException{
    if (iAlertPollingService == null)
      _initIAlertPollingServiceProxy();
    return iAlertPollingService.getAgentSnapshots(manModuleName);
  }
  
  
}