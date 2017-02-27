
package com.eterra._public.services.data.datatypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataElementSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataElementSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataElementSetting" type="{http://www.eterra.com/public/services/data/dataTypes}DataElementSetting" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataElementSettings", propOrder = {
    "dataElementSetting"
})
public class DataElementSettings {

    protected List<DataElementSetting> dataElementSetting;

    /**
     * Gets the value of the dataElementSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataElementSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataElementSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElementSetting }
     * 
     * 
     */
    public List<DataElementSetting> getDataElementSetting() {
        if (dataElementSetting == null) {
            dataElementSetting = new ArrayList<DataElementSetting>();
        }
        return this.dataElementSetting;
    }

}
