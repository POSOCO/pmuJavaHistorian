
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
 *         &lt;element name="dataElementSettings" type="{http://www.eterra.com/public/services/data/dataTypes}DataElementSettings" minOccurs="0"/>
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
    "dataElementSettings"
})
@XmlRootElement(name = "DataElementSettingsResponse")
public class DataElementSettingsResponse {

    protected DataElementSettings dataElementSettings;

    /**
     * Gets the value of the dataElementSettings property.
     * 
     * @return
     *     possible object is
     *     {@link DataElementSettings }
     *     
     */
    public DataElementSettings getDataElementSettings() {
        return dataElementSettings;
    }

    /**
     * Sets the value of the dataElementSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataElementSettings }
     *     
     */
    public void setDataElementSettings(DataElementSettings value) {
        this.dataElementSettings = value;
    }

}
