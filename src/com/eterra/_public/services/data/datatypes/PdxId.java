
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           A composite PDX ID
 *         
 * 
 * <p>Java class for PdxId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdxId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pdxType" type="{http://www.eterra.com/public/services/data/dataTypes}PdxType"/>
 *         &lt;element name="modeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pdxValue" type="{http://www.eterra.com/public/services/data/dataTypes}PdxValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PdxId", propOrder = {
    "measurementId",
    "pdxType",
    "modeId",
    "pdxValue"
})
public class PdxId {

    protected int measurementId;
    @XmlElement(required = true)
    protected PdxType pdxType;
    protected int modeId;
    @XmlElement(required = true)
    protected PdxValue pdxValue;

    /**
     * Gets the value of the measurementId property.
     * 
     */
    public int getMeasurementId() {
        return measurementId;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     */
    public void setMeasurementId(int value) {
        this.measurementId = value;
    }

    /**
     * Gets the value of the pdxType property.
     * 
     * @return
     *     possible object is
     *     {@link PdxType }
     *     
     */
    public PdxType getPdxType() {
        return pdxType;
    }

    /**
     * Sets the value of the pdxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdxType }
     *     
     */
    public void setPdxType(PdxType value) {
        this.pdxType = value;
    }

    /**
     * Gets the value of the modeId property.
     * 
     */
    public int getModeId() {
        return modeId;
    }

    /**
     * Sets the value of the modeId property.
     * 
     */
    public void setModeId(int value) {
        this.modeId = value;
    }

    /**
     * Gets the value of the pdxValue property.
     * 
     * @return
     *     possible object is
     *     {@link PdxValue }
     *     
     */
    public PdxValue getPdxValue() {
        return pdxValue;
    }

    /**
     * Sets the value of the pdxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdxValue }
     *     
     */
    public void setPdxValue(PdxValue value) {
        this.pdxValue = value;
    }

}
