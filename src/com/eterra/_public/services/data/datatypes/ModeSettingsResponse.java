
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modeSettings" type="{http://www.eterra.com/public/services/data/dataTypes}OscModeSettings" minOccurs="0"/>
 *         &lt;element name="pdx1Measurements" type="{http://www.eterra.com/public/services/data/dataTypes}IdList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modeSettings",
    "pdx1Measurements"
})
@XmlRootElement(name = "ModeSettingsResponse")
public class ModeSettingsResponse {

    protected OscModeSettings modeSettings;
    protected IdList pdx1Measurements;

    /**
     * Gets the value of the modeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link OscModeSettings }
     *     
     */
    public OscModeSettings getModeSettings() {
        return modeSettings;
    }

    /**
     * Sets the value of the modeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link OscModeSettings }
     *     
     */
    public void setModeSettings(OscModeSettings value) {
        this.modeSettings = value;
    }

    /**
     * Gets the value of the pdx1Measurements property.
     * 
     * @return
     *     possible object is
     *     {@link IdList }
     *     
     */
    public IdList getPdx1Measurements() {
        return pdx1Measurements;
    }

    /**
     * Sets the value of the pdx1Measurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdList }
     *     
     */
    public void setPdx1Measurements(IdList value) {
        this.pdx1Measurements = value;
    }

}
