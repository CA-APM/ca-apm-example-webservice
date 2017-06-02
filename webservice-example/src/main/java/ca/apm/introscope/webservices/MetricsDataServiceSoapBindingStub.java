/**
 * MetricsDataServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.apm.introscope.webservices;

import com.ca.wily.introscope.webservices.DMetricData;
import com.ca.wily.introscope.webservices.DTimesliceGroupedMetricData;
import com.ca.wily.introscope.webservices.DTimeslicedResultSetMetricData;
import com.ca.wily.introscope.webservices.IntroscopeWebServicesException;
import com.ca.wily.introscope.webservices.TimesliceGroupedMetricData;
import com.wily.introscope.server.webservicesapi.metricsdata.DTimeslicedMetricDataPerAgentMetric;
import com.wily.introscope.server.webservicesapi.metricsdata.DTimeslicedResultPerMetricData;

public class MetricsDataServiceSoapBindingStub extends org.apache.axis.client.Stub implements IMetricsDataService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBulkMetricData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "allMetrics"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "ArrayOfAgentMetricName"), ca.apm.introscope.webservices.AgentMetricName[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "CalendarTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "CalendarTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataFrequency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "ArrayOfTimeslicedMetricDataPerAgentMetric"));
        oper.setReturnClass(DTimeslicedMetricDataPerAgentMetric[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getBulkMetricDataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                                                                new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "fault"),
                                                                "IntroscopeWebServicesException",
                                                                new javax.xml.namespace.QName("http://webservicesapi.server.introscope.wily.com", "IntroscopeWebServicesException"), 
                                                                true
                ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLiveMetricData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agentRegex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metricPrefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "ArrayOfTimeslicedResultSetMetricData"));
        oper.setReturnClass(DTimeslicedResultSetMetricData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLiveMetricDataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                                                                new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "fault"),
                                                                "IntroscopeWebServicesException",
                                                                new javax.xml.namespace.QName("http://webservicesapi.server.introscope.wily.com", "IntroscopeWebServicesException"), 
                                                                true
                ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTopNMetricData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agentRegex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metricRegex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "CalendarTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "CalendarTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataFrequency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "topNCount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "decreasingOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "ArrayOfTimesliceGroupedMetricData"));
        oper.setReturnClass(DTimesliceGroupedMetricData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getTopNMetricDataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                                                                new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "fault"),
                                                                "IntroscopeWebServicesException",
                                                                new javax.xml.namespace.QName("http://webservicesapi.server.introscope.wily.com", "IntroscopeWebServicesException"), 
                                                                true
                ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMetricData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agentRegex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metricRegex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "CalendarTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "CalendarTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataFrequency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "ArrayOfTimesliceGroupedMetricData"));
        oper.setReturnClass(DTimesliceGroupedMetricData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getMetricDataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                                                                new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "fault"),
                                                                "IntroscopeWebServicesException",
                                                                new javax.xml.namespace.QName("http://webservicesapi.server.introscope.wily.com", "IntroscopeWebServicesException"), 
                                                                true
                ));
        _operations[3] = oper;

    }

    public MetricsDataServiceSoapBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public MetricsDataServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public MetricsDataServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://webservicesapi.server.introscope.wily.com", "IntroscopeWebServicesException");
        cachedSerQNames.add(qName);
        cls = IntroscopeWebServicesException.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "AgentMetricName");
        cachedSerQNames.add(qName);
        cls = AgentMetricName.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "ArrayOfAgentMetricName");
        cachedSerQNames.add(qName);
        cls = AgentMetricName[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "AgentMetricName");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "ArrayOfMetricData");
        cachedSerQNames.add(qName);
        cls = DMetricData[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "MetricData");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "ArrayOfTimeslicedMetricDataPerAgentMetric");
        cachedSerQNames.add(qName);
        cls = DTimeslicedMetricDataPerAgentMetric[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimeslicedMetricDataPerAgentMetric");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "ArrayOfTimeslicedResultPerMetricData");
        cachedSerQNames.add(qName);
        cls = DTimeslicedResultPerMetricData[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimeslicedResultPerMetricData");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "ArrayOfTimeslicedResultSetMetricData");
        cachedSerQNames.add(qName);
        cls = DTimeslicedResultSetMetricData[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimeslicedResultSetMetricData");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "ArrayOfTimesliceGroupedMetricData");
        cachedSerQNames.add(qName);
        cls = DTimesliceGroupedMetricData[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimesliceGroupedMetricData");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "MetricData");
        cachedSerQNames.add(qName);
        cls = DMetricData.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimeslicedMetricDataPerAgentMetric");
        cachedSerQNames.add(qName);
        cls = DTimeslicedMetricDataPerAgentMetric.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimeslicedResultPerMetricData");
        cachedSerQNames.add(qName);
        cls = DTimeslicedResultPerMetricData.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimeslicedResultSetMetricData");
        cachedSerQNames.add(qName);
        cls = DTimeslicedResultSetMetricData.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimesliceGroupedMetricData");
        cachedSerQNames.add(qName);
        cls = DTimesliceGroupedMetricData.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                    cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                    cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public DTimeslicedMetricDataPerAgentMetric[] getBulkMetricData(AgentMetricName[] allMetrics, java.util.Calendar startTime, java.util.Calendar endTime, int dataFrequency) throws java.rmi.RemoteException, IntroscopeWebServicesException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metricsdata.webservicesimpl.server.introscope.wily.com", "getBulkMetricData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {allMetrics, startTime, endTime, new java.lang.Integer(dataFrequency)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (DTimeslicedMetricDataPerAgentMetric[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (DTimeslicedMetricDataPerAgentMetric[]) org.apache.axis.utils.JavaUtils.convert(_resp, DTimeslicedMetricDataPerAgentMetric[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof IntroscopeWebServicesException) {
                    throw (IntroscopeWebServicesException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public DTimeslicedResultSetMetricData[] getLiveMetricData(java.lang.String agentRegex, java.lang.String metricPrefix) throws java.rmi.RemoteException, IntroscopeWebServicesException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metricsdata.webservicesimpl.server.introscope.wily.com", "getLiveMetricData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {agentRegex, metricPrefix});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DTimeslicedResultSetMetricData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (DTimeslicedResultSetMetricData[]) org.apache.axis.utils.JavaUtils.convert(_resp, DTimeslicedResultSetMetricData[].class);
            }
        }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof IntroscopeWebServicesException) {
                    throw (IntroscopeWebServicesException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public TimesliceGroupedMetricData[] getTopNMetricData(java.lang.String agentRegex, java.lang.String metricRegex, java.util.Calendar startTime, java.util.Calendar endTime, int dataFrequency, int topNCount, boolean decreasingOrder) throws java.rmi.RemoteException, IntroscopeWebServicesException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metricsdata.webservicesimpl.server.introscope.wily.com", "getTopNMetricData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {agentRegex, metricRegex, startTime, endTime, new java.lang.Integer(dataFrequency), new java.lang.Integer(topNCount), new java.lang.Boolean(decreasingOrder)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (TimesliceGroupedMetricData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (TimesliceGroupedMetricData[]) org.apache.axis.utils.JavaUtils.convert(_resp, DTimesliceGroupedMetricData[].class);
            }
        }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof IntroscopeWebServicesException) {
                    throw (IntroscopeWebServicesException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public TimesliceGroupedMetricData[] getMetricData(java.lang.String agentRegex, java.lang.String metricRegex, java.util.Calendar startTime, java.util.Calendar endTime, int dataFrequency) throws java.rmi.RemoteException, IntroscopeWebServicesException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metricsdata.webservicesimpl.server.introscope.wily.com", "getMetricData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {agentRegex, metricRegex, startTime, endTime, new java.lang.Integer(dataFrequency)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (TimesliceGroupedMetricData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (TimesliceGroupedMetricData[]) org.apache.axis.utils.JavaUtils.convert(_resp, DTimesliceGroupedMetricData[].class);
            }
        }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof IntroscopeWebServicesException) {
                    throw (IntroscopeWebServicesException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

}
