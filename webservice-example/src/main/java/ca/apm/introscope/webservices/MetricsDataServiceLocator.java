/**
 * MetricsDataServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.apm.introscope.webservices;

public class MetricsDataServiceLocator extends org.apache.axis.client.Service implements ca.apm.introscope.webservices.MetricsDataService {

    public MetricsDataServiceLocator() {
    }


    public MetricsDataServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MetricsDataServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MetricsDataService
    private java.lang.String MetricsDataService_address = "http://boot2docker:8081/introscope-web-services/services/MetricsDataService";

    public java.lang.String getMetricsDataServiceAddress() {
        return MetricsDataService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MetricsDataServiceWSDDServiceName = "MetricsDataService";

    public java.lang.String getMetricsDataServiceWSDDServiceName() {
        return MetricsDataServiceWSDDServiceName;
    }

    public void setMetricsDataServiceWSDDServiceName(java.lang.String name) {
        MetricsDataServiceWSDDServiceName = name;
    }

    public ca.apm.introscope.webservices.IMetricsDataService getMetricsDataService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MetricsDataService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMetricsDataService(endpoint);
    }

    public ca.apm.introscope.webservices.IMetricsDataService getMetricsDataService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ca.apm.introscope.webservices.MetricsDataServiceSoapBindingStub _stub = new ca.apm.introscope.webservices.MetricsDataServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMetricsDataServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMetricsDataServiceEndpointAddress(java.lang.String address) {
        MetricsDataService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ca.apm.introscope.webservices.IMetricsDataService.class.isAssignableFrom(serviceEndpointInterface)) {
                ca.apm.introscope.webservices.MetricsDataServiceSoapBindingStub _stub = new ca.apm.introscope.webservices.MetricsDataServiceSoapBindingStub(new java.net.URL(MetricsDataService_address), this);
                _stub.setPortName(getMetricsDataServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MetricsDataService".equals(inputPortName)) {
            return getMetricsDataService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "MetricsDataService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "MetricsDataService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MetricsDataService".equals(portName)) {
            setMetricsDataServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
