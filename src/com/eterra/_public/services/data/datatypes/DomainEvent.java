
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eterra.com/public/services/data/dataTypes}SimpleEvent">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.eterra.com/public/services/data/dataTypes}EventType"/>
 *         &lt;element name="value" type="{http://www.eterra.com/public/services/data/dataTypes}EventDataElement"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainEvent", propOrder = {
    "type",
    "value"
})
public class DomainEvent
    extends SimpleEvent
{

    @XmlElement(required = true)
    protected EventType type;
    @XmlElement(required = true)
    protected EventDataElement value;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link EventDataElement }
     *     
     */
    public EventDataElement getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDataElement }
     *     
     */
    public void setValue(EventDataElement value) {
        this.value = value;
    }

}
