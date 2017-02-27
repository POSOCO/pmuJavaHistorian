
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OscShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OscShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="magnitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="phaseAngle" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="phaseAmplitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="measurementID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measurementType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OscShape", propOrder = {
    "magnitude",
    "phaseAngle",
    "phaseAmplitude",
    "measurementID",
    "measurementType"
})
public class OscShape {

    protected float magnitude;
    protected float phaseAngle;
    protected float phaseAmplitude;
    protected int measurementID;
    @XmlElement(required = true)
    protected String measurementType;

    /**
     * Gets the value of the magnitude property.
     * 
     */
    public float getMagnitude() {
        return magnitude;
    }

    /**
     * Sets the value of the magnitude property.
     * 
     */
    public void setMagnitude(float value) {
        this.magnitude = value;
    }

    /**
     * Gets the value of the phaseAngle property.
     * 
     */
    public float getPhaseAngle() {
        return phaseAngle;
    }

    /**
     * Sets the value of the phaseAngle property.
     * 
     */
    public void setPhaseAngle(float value) {
        this.phaseAngle = value;
    }

    /**
     * Gets the value of the phaseAmplitude property.
     * 
     */
    public float getPhaseAmplitude() {
        return phaseAmplitude;
    }

    /**
     * Sets the value of the phaseAmplitude property.
     * 
     */
    public void setPhaseAmplitude(float value) {
        this.phaseAmplitude = value;
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
     * Gets the value of the measurementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementType() {
        return measurementType;
    }

    /**
     * Sets the value of the measurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementType(String value) {
        this.measurementType = value;
    }

}
