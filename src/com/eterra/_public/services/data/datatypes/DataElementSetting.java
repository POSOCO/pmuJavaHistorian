
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataElementSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataElementSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alarm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="alertthreshold" type="{http://www.eterra.com/public/services/data/dataTypes}LimitSetting" minOccurs="0"/>
 *         &lt;element name="alarmthreshold" type="{http://www.eterra.com/public/services/data/dataTypes}LimitSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataElementSetting", propOrder = {
    "measurementID",
    "alarm",
    "alertthreshold",
    "alarmthreshold"
})
public class DataElementSetting {

    protected int measurementID;
    protected boolean alarm;
    protected LimitSetting alertthreshold;
    protected LimitSetting alarmthreshold;

    /**
     * Gets the value of the measurementID property.
     * 
     */
    public int getMeasurementID() {
        return measurementID;
    }

    /**
     * Sets the value of the measurementID property.
     * 
     */
    public void setMeasurementID(int value) {
        this.measurementID = value;
    }

    /**
     * Gets the value of the alarm property.
     * 
     */
    public boolean isAlarm() {
        return alarm;
    }

    /**
     * Sets the value of the alarm property.
     * 
     */
    public void setAlarm(boolean value) {
        this.alarm = value;
    }

    /**
     * Gets the value of the alertthreshold property.
     * 
     * @return
     *     possible object is
     *     {@link LimitSetting }
     *     
     */
    public LimitSetting getAlertthreshold() {
        return alertthreshold;
    }

    /**
     * Sets the value of the alertthreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitSetting }
     *     
     */
    public void setAlertthreshold(LimitSetting value) {
        this.alertthreshold = value;
    }

    /**
     * Gets the value of the alarmthreshold property.
     * 
     * @return
     *     possible object is
     *     {@link LimitSetting }
     *     
     */
    public LimitSetting getAlarmthreshold() {
        return alarmthreshold;
    }

    /**
     * Sets the value of the alarmthreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitSetting }
     *     
     */
    public void setAlarmthreshold(LimitSetting value) {
        this.alarmthreshold = value;
    }

}
