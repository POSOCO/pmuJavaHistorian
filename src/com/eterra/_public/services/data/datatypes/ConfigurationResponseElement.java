
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationResponseElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationResponseElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmuID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="measurementID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="measurementType" type="{http://www.eterra.com/public/services/data/dataTypes}MeasurementType"/>
 *         &lt;element name="scadaUiName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unit" type="{http://www.eterra.com/public/services/data/dataTypes}Unit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationResponseElement", propOrder = {
    "pmuID",
    "measurementID",
    "stationName",
    "kv",
    "deviceID",
    "measurementType",
    "scadaUiName",
    "unit"
})
public class ConfigurationResponseElement {

    protected Integer pmuID;
    protected int measurementID;
    @XmlElement(required = true)
    protected String stationName;
    @XmlElement(required = true)
    protected String kv;
    @XmlElement(required = true)
    protected String deviceID;
    @XmlElement(required = true)
    protected MeasurementType measurementType;
    @XmlElement(required = true)
    protected String scadaUiName;
    @XmlElement(required = true)
    protected Unit unit;

    /**
     * Gets the value of the pmuID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPmuID() {
        return pmuID;
    }

    /**
     * Sets the value of the pmuID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPmuID(Integer value) {
        this.pmuID = value;
    }

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
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the kv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKv() {
        return kv;
    }

    /**
     * Sets the value of the kv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKv(String value) {
        this.kv = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the measurementType property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMeasurementType() {
        return measurementType;
    }

    /**
     * Sets the value of the measurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMeasurementType(MeasurementType value) {
        this.measurementType = value;
    }

    /**
     * Gets the value of the scadaUiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScadaUiName() {
        return scadaUiName;
    }

    /**
     * Sets the value of the scadaUiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScadaUiName(String value) {
        this.scadaUiName = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link Unit }
     *     
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit }
     *     
     */
    public void setUnit(Unit value) {
        this.unit = value;
    }

}
