
package com.eterra._public.services.data.datatypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverviewStateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverviewStateList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overviewState" type="{http://www.eterra.com/public/services/data/dataTypes}OverviewState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverviewStateList", propOrder = {
    "overviewState"
})
public class OverviewStateList {

    protected List<OverviewState> overviewState;

    /**
     * Gets the value of the overviewState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overviewState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverviewState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverviewState }
     * 
     * 
     */
    public List<OverviewState> getOverviewState() {
        if (overviewState == null) {
            overviewState = new ArrayList<OverviewState>();
        }
        return this.overviewState;
    }

}
