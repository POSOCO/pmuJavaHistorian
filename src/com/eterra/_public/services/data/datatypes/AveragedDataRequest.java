
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
 *         &lt;element name="stations" type="{http://www.eterra.com/public/services/data/dataTypes}StringList"/>
 *         &lt;element name="measurementTypes" type="{http://www.eterra.com/public/services/data/dataTypes}MeasurementTypeList"/>
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
    "stations",
    "measurementTypes"
})
@XmlRootElement(name = "AveragedDataRequest")
public class AveragedDataRequest {

    @XmlElement(required = true)
    protected TimeRangeElement timeRange;
    @XmlElement(required = true)
    protected StringList stations;
    @XmlElement(required = true)
    protected MeasurementTypeList measurementTypes;

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
     * Gets the value of the stations property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getStations() {
        return stations;
    }

    /**
     * Sets the value of the stations property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setStations(StringList value) {
        this.stations = value;
    }

    /**
     * Gets the value of the measurementTypes property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementTypeList }
     *     
     */
    public MeasurementTypeList getMeasurementTypes() {
        return measurementTypes;
    }

    /**
     * Sets the value of the measurementTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementTypeList }
     *     
     */
    public void setMeasurementTypes(MeasurementTypeList value) {
        this.measurementTypes = value;
    }

}
