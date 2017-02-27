
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Define an RoC in terms of its source measurement, type, and window length.
 *         
 * 
 * <p>Java class for RocMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RocMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceMeasurementID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="windowLength" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RocMap", propOrder = {
    "measurementID",
    "sourceMeasurementID",
    "type",
    "windowLength"
})
public class RocMap {

    protected int measurementID;
    protected int sourceMeasurementID;
    @XmlElement(required = true)
    protected String type;
    protected float windowLength;

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
     * Gets the value of the sourceMeasurementID property.
     * 
     */
    public int getSourceMeasurementID() {
        return sourceMeasurementID;
    }

    /**
     * Sets the value of the sourceMeasurementID property.
     * 
     */
    public void setSourceMeasurementID(int value) {
        this.sourceMeasurementID = value;
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

    /**
     * Gets the value of the windowLength property.
     * 
     */
    public float getWindowLength() {
        return windowLength;
    }

    /**
     * Sets the value of the windowLength property.
     * 
     */
    public void setWindowLength(float value) {
        this.windowLength = value;
    }

}
