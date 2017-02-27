
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OscillationEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OscillationEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eterra.com/public/services/data/dataTypes}SimpleEvent">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.eterra.com/public/services/data/dataTypes}EventModeValueElement"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OscillationEvent", propOrder = {
    "value"
})
public class OscillationEvent
    extends SimpleEvent
{

    @XmlElement(required = true)
    protected EventModeValueElement value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link EventModeValueElement }
     *     
     */
    public EventModeValueElement getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventModeValueElement }
     *     
     */
    public void setValue(EventModeValueElement value) {
        this.value = value;
    }

}
