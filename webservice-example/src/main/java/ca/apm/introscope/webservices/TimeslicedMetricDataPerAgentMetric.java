/**
 * TimeslicedMetricDataPerAgentMetric.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.apm.introscope.webservices;

public class TimeslicedMetricDataPerAgentMetric  implements java.io.Serializable {
    private ca.apm.introscope.webservices.AgentMetricName agentMetric;

    private int metricType;

    private ca.apm.introscope.webservices.TimeslicedResultPerMetricData[] timeslicedMetricData;

    public TimeslicedMetricDataPerAgentMetric() {
    }

    public TimeslicedMetricDataPerAgentMetric(
           ca.apm.introscope.webservices.AgentMetricName agentMetric,
           int metricType,
           ca.apm.introscope.webservices.TimeslicedResultPerMetricData[] timeslicedMetricData) {
           this.agentMetric = agentMetric;
           this.metricType = metricType;
           this.timeslicedMetricData = timeslicedMetricData;
    }


    /**
     * Gets the agentMetric value for this TimeslicedMetricDataPerAgentMetric.
     * 
     * @return agentMetric
     */
    public ca.apm.introscope.webservices.AgentMetricName getAgentMetric() {
        return agentMetric;
    }


    /**
     * Sets the agentMetric value for this TimeslicedMetricDataPerAgentMetric.
     * 
     * @param agentMetric
     */
    public void setAgentMetric(ca.apm.introscope.webservices.AgentMetricName agentMetric) {
        this.agentMetric = agentMetric;
    }


    /**
     * Gets the metricType value for this TimeslicedMetricDataPerAgentMetric.
     * 
     * @return metricType
     */
    public int getMetricType() {
        return metricType;
    }


    /**
     * Sets the metricType value for this TimeslicedMetricDataPerAgentMetric.
     * 
     * @param metricType
     */
    public void setMetricType(int metricType) {
        this.metricType = metricType;
    }


    /**
     * Gets the timeslicedMetricData value for this TimeslicedMetricDataPerAgentMetric.
     * 
     * @return timeslicedMetricData
     */
    public ca.apm.introscope.webservices.TimeslicedResultPerMetricData[] getTimeslicedMetricData() {
        return timeslicedMetricData;
    }


    /**
     * Sets the timeslicedMetricData value for this TimeslicedMetricDataPerAgentMetric.
     * 
     * @param timeslicedMetricData
     */
    public void setTimeslicedMetricData(ca.apm.introscope.webservices.TimeslicedResultPerMetricData[] timeslicedMetricData) {
        this.timeslicedMetricData = timeslicedMetricData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeslicedMetricDataPerAgentMetric)) return false;
        TimeslicedMetricDataPerAgentMetric other = (TimeslicedMetricDataPerAgentMetric) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentMetric==null && other.getAgentMetric()==null) || 
             (this.agentMetric!=null &&
              this.agentMetric.equals(other.getAgentMetric()))) &&
            this.metricType == other.getMetricType() &&
            ((this.timeslicedMetricData==null && other.getTimeslicedMetricData()==null) || 
             (this.timeslicedMetricData!=null &&
              java.util.Arrays.equals(this.timeslicedMetricData, other.getTimeslicedMetricData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAgentMetric() != null) {
            _hashCode += getAgentMetric().hashCode();
        }
        _hashCode += getMetricType();
        if (getTimeslicedMetricData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeslicedMetricData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeslicedMetricData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeslicedMetricDataPerAgentMetric.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimeslicedMetricDataPerAgentMetric"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentMetric");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agentMetric"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "AgentMetricName"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeslicedMetricData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeslicedMetricData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimeslicedResultPerMetricData"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
