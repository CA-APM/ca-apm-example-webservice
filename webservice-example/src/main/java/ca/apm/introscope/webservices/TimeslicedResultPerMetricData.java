/**
 * TimeslicedResultPerMetricData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.apm.introscope.webservices;

public class TimeslicedResultPerMetricData  implements java.io.Serializable {
    private java.lang.String metricValue;

    private java.util.Calendar timesliceEndTime;

    private java.util.Calendar timesliceStartTime;

    public TimeslicedResultPerMetricData() {
    }

    public TimeslicedResultPerMetricData(
           java.lang.String metricValue,
           java.util.Calendar timesliceEndTime,
           java.util.Calendar timesliceStartTime) {
           this.metricValue = metricValue;
           this.timesliceEndTime = timesliceEndTime;
           this.timesliceStartTime = timesliceStartTime;
    }


    /**
     * Gets the metricValue value for this TimeslicedResultPerMetricData.
     * 
     * @return metricValue
     */
    public java.lang.String getMetricValue() {
        return metricValue;
    }


    /**
     * Sets the metricValue value for this TimeslicedResultPerMetricData.
     * 
     * @param metricValue
     */
    public void setMetricValue(java.lang.String metricValue) {
        this.metricValue = metricValue;
    }


    /**
     * Gets the timesliceEndTime value for this TimeslicedResultPerMetricData.
     * 
     * @return timesliceEndTime
     */
    public java.util.Calendar getTimesliceEndTime() {
        return timesliceEndTime;
    }


    /**
     * Sets the timesliceEndTime value for this TimeslicedResultPerMetricData.
     * 
     * @param timesliceEndTime
     */
    public void setTimesliceEndTime(java.util.Calendar timesliceEndTime) {
        this.timesliceEndTime = timesliceEndTime;
    }


    /**
     * Gets the timesliceStartTime value for this TimeslicedResultPerMetricData.
     * 
     * @return timesliceStartTime
     */
    public java.util.Calendar getTimesliceStartTime() {
        return timesliceStartTime;
    }


    /**
     * Sets the timesliceStartTime value for this TimeslicedResultPerMetricData.
     * 
     * @param timesliceStartTime
     */
    public void setTimesliceStartTime(java.util.Calendar timesliceStartTime) {
        this.timesliceStartTime = timesliceStartTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeslicedResultPerMetricData)) return false;
        TimeslicedResultPerMetricData other = (TimeslicedResultPerMetricData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metricValue==null && other.getMetricValue()==null) || 
             (this.metricValue!=null &&
              this.metricValue.equals(other.getMetricValue()))) &&
            ((this.timesliceEndTime==null && other.getTimesliceEndTime()==null) || 
             (this.timesliceEndTime!=null &&
              this.timesliceEndTime.equals(other.getTimesliceEndTime()))) &&
            ((this.timesliceStartTime==null && other.getTimesliceStartTime()==null) || 
             (this.timesliceStartTime!=null &&
              this.timesliceStartTime.equals(other.getTimesliceStartTime())));
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
        if (getMetricValue() != null) {
            _hashCode += getMetricValue().hashCode();
        }
        if (getTimesliceEndTime() != null) {
            _hashCode += getTimesliceEndTime().hashCode();
        }
        if (getTimesliceStartTime() != null) {
            _hashCode += getTimesliceStartTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeslicedResultPerMetricData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimeslicedResultPerMetricData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timesliceEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timesliceEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timesliceStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timesliceStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
