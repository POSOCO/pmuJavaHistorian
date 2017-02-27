
package com.eterra._public.services.data.datatypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceAngleChangeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceAngleChangeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceAngleChanges" type="{http://www.eterra.com/public/services/data/dataTypes}ReferenceAngleChange" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceAngleChangeList", propOrder = {
    "referenceAngleChanges"
})
public class ReferenceAngleChangeList {

    @XmlElement(required = true)
    protected List<ReferenceAngleChange> referenceAngleChanges;

    /**
     * Gets the value of the referenceAngleChanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceAngleChanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceAngleChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceAngleChange }
     * 
     * 
     */
    public List<ReferenceAngleChange> getReferenceAngleChanges() {
        if (referenceAngleChanges == null) {
            referenceAngleChanges = new ArrayList<ReferenceAngleChange>();
        }
        return this.referenceAngleChanges;
    }

}
