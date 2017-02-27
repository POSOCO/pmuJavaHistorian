
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OscModeSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OscModeSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minFrequency" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="maxFrequency" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OscModeSetting", propOrder = {
    "modeId",
    "minFrequency",
    "maxFrequency"
})
public class OscModeSetting {

    @XmlElement(required = true)
    protected String modeId;
    protected float minFrequency;
    protected float maxFrequency;

    /**
     * Gets the value of the modeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeId() {
        return modeId;
    }

    /**
     * Sets the value of the modeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeId(String value) {
        this.modeId = value;
    }

    /**
     * Gets the value of the minFrequency property.
     * 
     */
    public float getMinFrequency() {
        return minFrequency;
    }

    /**
     * Sets the value of the minFrequency property.
     * 
     */
    public void setMinFrequency(float value) {
        this.minFrequency = value;
    }

    /**
     * Gets the value of the maxFrequency property.
     * 
     */
    public float getMaxFrequency() {
        return maxFrequency;
    }

    /**
     * Sets the value of the maxFrequency property.
     * 
     */
    public void setMaxFrequency(float value) {
        this.maxFrequency = value;
    }

}
