
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
 *         &lt;element name="overviewStates" type="{http://www.eterra.com/public/services/data/dataTypes}OverviewStateList" minOccurs="0"/>
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
    "overviewStates"
})
@XmlRootElement(name = "MeasurementBasedOverviewStateResponse")
public class MeasurementBasedOverviewStateResponse {

    protected OverviewStateList overviewStates;

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

}
