
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="timeRange" type="{http://www.eterra.com/public/services/data/dataTypes}TimeRangeElement"/>
 *         &lt;element name="ids" type="{http://www.eterra.com/public/services/data/dataTypes}PdxIdList"/>
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
    "timeRange",
    "ids"
})
@XmlRootElement(name = "PdxModeFilteredDataRequest")
public class PdxModeFilteredDataRequest {

    @XmlElement(required = true)
    protected TimeRangeElement timeRange;
    @XmlElement(required = true)
    protected PdxIdList ids;

    /**
     * Gets the value of the timeRange property.
     * 
     * @return
     *     possible object is
     *     {@link TimeRangeElement }
     *     
     */
    public TimeRangeElement getTimeRange() {
        return timeRange;
    }

    /**
     * Sets the value of the timeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeRangeElement }
     *     
     */
    public void setTimeRange(TimeRangeElement value) {
        this.timeRange = value;
    }

    /**
     * Gets the value of the ids property.
     * 
     * @return
     *     possible object is
     *     {@link PdxIdList }
     *     
     */
    public PdxIdList getIds() {
        return ids;
    }

    /**
     * Sets the value of the ids property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdxIdList }
     *     
     */
    public void setIds(PdxIdList value) {
        this.ids = value;
    }

}
