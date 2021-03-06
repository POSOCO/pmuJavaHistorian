
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventModeValueElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventModeValueElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="amplitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="measurementType" type="{http://www.eterra.com/public/services/data/dataTypes}MeasurementType"/>
 *         &lt;element name="damping" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="energy" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventModeValueElement", propOrder = {
    "measurementID",
    "modeId",
    "frequency",
    "amplitude",
    "measurementType",
    "damping",
    "energy",
    "type"
})
public class EventModeValueElement {

    protected int measurementID;
    @XmlElement(required = true)
    protected String modeId;
    protected Float frequency;
    protected Float amplitude;
    @XmlElement(required = true)
    protected MeasurementType measurementType;
    protected Float damping;
    protected Float energy;
    protected String type;

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
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFrequency(Float value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the amplitude property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAmplitude() {
        return amplitude;
    }

    /**
     * Sets the value of the amplitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmplitude(Float value) {
        this.amplitude = value;
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
     * Gets the value of the damping property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDamping() {
        return damping;
    }

    /**
     * Sets the value of the damping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDamping(Float value) {
        this.damping = value;
    }

    /**
     * Gets the value of the energy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEnergy() {
        return energy;
    }

    /**
     * Sets the value of the energy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEnergy(Float value) {
        this.energy = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
