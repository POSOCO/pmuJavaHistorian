
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
 *         &lt;element name="events" type="{http://www.eterra.com/public/services/data/dataTypes}EventsList" minOccurs="0"/>
 *         &lt;element name="overviewStates" type="{http://www.eterra.com/public/services/data/dataTypes}OverviewStateList" minOccurs="0"/>
 *         &lt;element name="modeValueElements" type="{http://www.eterra.com/public/services/data/dataTypes}ModeValuesList" minOccurs="0"/>
 *         &lt;element name="modeShapes" type="{http://www.eterra.com/public/services/data/dataTypes}OscShapesList" minOccurs="0"/>
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
    "events",
    "overviewStates",
    "modeValueElements",
    "modeShapes"
})
@XmlRootElement(name = "PdxDataAndEventsResponse")
public class PdxDataAndEventsResponse {

    protected EventsList events;
    protected OverviewStateList overviewStates;
    protected ModeValuesList modeValueElements;
    protected OscShapesList modeShapes;

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link EventsList }
     *     
     */
    public EventsList getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsList }
     *     
     */
    public void setEvents(EventsList value) {
        this.events = value;
    }

    /**
     * Gets the value of the overviewStates property.
     * 
     * @return
     *     possible object is
     *     {@link OverviewStateList }
     *     
     */
    public OverviewStateList getOverviewStates() {
        return overviewStates;
    }

    /**
     * Sets the value of the overviewStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverviewStateList }
     *     
     */
    public void setOverviewStates(OverviewStateList value) {
        this.overviewStates = value;
    }

    /**
     * Gets the value of the modeValueElements property.
     * 
     * @return
     *     possible object is
     *     {@link ModeValuesList }
     *     
     */
    public ModeValuesList getModeValueElements() {
        return modeValueElements;
    }

    /**
     * Sets the value of the modeValueElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModeValuesList }
     *     
     */
    public void setModeValueElements(ModeValuesList value) {
        this.modeValueElements = value;
    }

    /**
     * Gets the value of the modeShapes property.
     * 
     * @return
     *     possible object is
     *     {@link OscShapesList }
     *     
     */
    public OscShapesList getModeShapes() {
        return modeShapes;
    }

    /**
     * Sets the value of the modeShapes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OscShapesList }
     *     
     */
    public void setModeShapes(OscShapesList value) {
        this.modeShapes = value;
    }

}
