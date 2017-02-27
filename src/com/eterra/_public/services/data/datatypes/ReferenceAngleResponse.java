
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
 *         &lt;element name="referenceAngleChangeList" type="{http://www.eterra.com/public/services/data/dataTypes}ReferenceAngleChangeList"/>
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
    "referenceAngleChangeList"
})
@XmlRootElement(name = "ReferenceAngleResponse")
public class ReferenceAngleResponse {

    @XmlElement(required = true)
    protected ReferenceAngleChangeList referenceAngleChangeList;

    /**
     * Gets the value of the referenceAngleChangeList property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceAngleChangeList }
     *     
     */
    public ReferenceAngleChangeList getReferenceAngleChangeList() {
        return referenceAngleChangeList;
    }

    /**
     * Sets the value of the referenceAngleChangeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceAngleChangeList }
     *     
     */
    public void setReferenceAngleChangeList(ReferenceAngleChangeList value) {
        this.referenceAngleChangeList = value;
    }

}
