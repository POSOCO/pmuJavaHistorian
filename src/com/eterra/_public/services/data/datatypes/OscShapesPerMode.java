
package com.eterra._public.services.data.datatypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OscShapesPerMode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OscShapesPerMode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oscShape" type="{http://www.eterra.com/public/services/data/dataTypes}OscShape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OscShapesPerMode", propOrder = {
    "modeId",
    "oscShape"
})
public class OscShapesPerMode {

    protected String modeId;
    protected List<OscShape> oscShape;

    /**
     * Gets the value of the modeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeId() {
        return modeId;
    }

    /**
     * Sets the value of the modeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeId(String value) {
        this.modeId = value;
    }

    /**
     * Gets the value of the oscShape property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oscShape property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOscShape().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OscShape }
     * 
     * 
     */
    public List<OscShape> getOscShape() {
        if (oscShape == null) {
            oscShape = new ArrayList<OscShape>();
        }
        return this.oscShape;
    }

}
