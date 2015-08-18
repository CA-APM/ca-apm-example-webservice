/**
 * TimesliceGroupedMetricData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.apm.introscope.webservices;

public class TimesliceGroupedMetricData  implements java.io.Serializable {
    private ca.apm.introscope.webservices.MetricData[] metricData;

    private java.util.Calendar timesliceEndTime;

    private java.util.Calendar timesliceStartTime;

    public TimesliceGroupedMetricData() {
    }

    public TimesliceGroupedMetricData(
           ca.apm.introscope.webservices.MetricData[] metricData,
           java.util.Calendar timesliceEndTime,
           java.util.Calendar timesliceStartTime) {
           this.metricData = metricData;
           this.timesliceEndTime = timesliceEndTime;
           this.timesliceStartTime = timesliceStartTime;
    }


    /**
     * Gets the metricData value for this TimesliceGroupedMetricData.
     * 
     * @return metricData
     */
    public ca.apm.introscope.webservices.MetricData[] getMetricData() {
        return metricData;
    }


    /**
     * Sets the metricData value for this TimesliceGroupedMetricData.
     * 
     * @param metricData
     */
    public void setMetricData(ca.apm.introscope.webservices.MetricData[] metricData) {
        this.metricData = metricData;
    }


    /**
     * Gets the timesliceEndTime value for this TimesliceGroupedMetricData.
     * 
     * @return timesliceEndTime
     */
    public java.util.Calendar getTimesliceEndTime() {
        return timesliceEndTime;
    }


    /**
     * Sets the timesliceEndTime value for this TimesliceGroupedMetricData.
     * 
     * @param timesliceEndTime
     */
    public void setTimesliceEndTime(java.util.Calendar timesliceEndTime) {
        this.timesliceEndTime = timesliceEndTime;
    }


    /**
     * Gets the timesliceStartTime value for this TimesliceGroupedMetricData.
     * 
     * @return timesliceStartTime
     */
    public java.util.Calendar getTimesliceStartTime() {
        return timesliceStartTime;
    }


    /**
     * Sets the timesliceStartTime value for this TimesliceGroupedMetricData.
     * 
     * @param timesliceStartTime
     */
    public void setTimesliceStartTime(java.util.Calendar timesliceStartTime) {
        this.timesliceStartTime = timesliceStartTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimesliceGroupedMetricData)) return false;
        TimesliceGroupedMetricData other = (TimesliceGroupedMetricData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metricData==null && other.getMetricData()==null) || 
             (this.metricData!=null &&
              java.util.Arrays.equals(this.metricData, other.getMetricData()))) &&
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
        if (getMetricData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetricData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetricData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(TimesliceGroupedMetricData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "TimesliceGroupedMetricData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ca.wily.introscope.webservices", "MetricData"));
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
