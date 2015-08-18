/**
 * MetricData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.apm.introscope.webservices;

public class MetricData  implements java.io.Serializable {
    private java.lang.String agentName;

    private java.lang.String metricName;

    private int metricType;

    private java.lang.String metricValue;

    public MetricData() {
    }

    public MetricData(
           java.lang.String agentName,
           java.lang.String metricName,
           int metricType,
           java.lang.String metricValue) {
           this.agentName = agentName;
           this.metricName = metricName;
           this.metricType = metricType;
           this.metricValue = metricValue;
    }


    /**
     * Gets the agentName value for this MetricData.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this MetricData.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }


    /**
     * Gets the metricName value for this MetricData.
     * 
     * @return metricName
     */
    public java.lang.String getMetricName() {
        return metricName;
    }


    /**
     * Sets the metricName value for this MetricData.
     * 
     * @param metricName
     */
    public void setMetricName(java.lang.String metricName) {
        this.metricName = metricName;
    }


    /**
     * Gets the metricType value for this MetricData.
     * 
     * @return metricType
     */
    public int getMetricType() {
        return metricType;
    }


    /**
     * Sets the metricType value for this MetricData.
     * 
     * @param metricType
     */
    public void setMetricType(int metricType) {
        this.metricType = metricType;
    }


    /**
     * Gets the metricValue value for this MetricData.
     * 
     * @return metricValue
     */
    public java.lang.String getMetricValue() {
        return metricValue;
    }


    /**
     * Sets the metricValue value for this MetricData.
     * 
     * @param metricValue
     */
    public void setMetricValue(java.lang.String metricValue) {
        this.metricValue = metricValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetricData)) return false;
        MetricData other = (MetricData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName()))) &&
            ((this.metricName==null && other.getMetricName()==null) || 
             (this.metricName!=null &&
              this.metricName.equals(other.getMetricName()))) &&
            this.metricType == other.getMetricType() &&
            ((this.metricValue==null && other.getMetricValue()==null) || 
             (this.metricValue!=null &&
              this.metricValue.equals(other.getMetricValue())));
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
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        if (getMetricName() != null) {
            _hashCode += getMetricName().hashCode();
        }
        _hashCode += getMetricType();
        if (getMetricValue() != null) {
            _hashCode += getMetricValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetricData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "MetricData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
