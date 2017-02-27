
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WamsEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WamsEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eterra.com/public/services/data/dataTypes}SimpleEvent">
 *       &lt;sequence>
 *         &lt;element name="measurementType" type="{http://www.eterra.com/public/services/data/dataTypes}MeasurementType"/>
 *         &lt;element name="type" type="{http://www.eterra.com/public/services/data/dataTypes}EventType"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="triggerMeasurementId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="triggerSubstationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WamsEvent", propOrder = {
    "measurementType",
    "type",
    "uuid",
    "triggerMeasurementId",
    "triggerSubstationName"
})
public class WamsEvent
    extends SimpleEvent
{

    @XmlElement(required = true)
    protected MeasurementType measurementType;
    @XmlElement(required = true)
    protected EventType type;
    @XmlElement(required = true)
    protected String uuid;
    protected int triggerMeasurementId;
    @XmlElement(required = true)
    protected String triggerSubstationName;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setType(EventType value) {
        this.type = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the triggerMeasurementId property.
     * 
     */
    public int getTriggerMeasurementId() {
        return triggerMeasurementId;
    }

    /**
     * Sets the value of the triggerMeasurementId property.
     * 
     */
    public void setTriggerMeasurementId(int value) {
        this.triggerMeasurementId = value;
    }

    /**
     * Gets the value of the triggerSubstationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerSubstationName() {
        return triggerSubstationName;
    }

    /**
     * Sets the value of the triggerSubstationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerSubstationName(String value) {
        this.triggerSubstationName = value;
    }

}
