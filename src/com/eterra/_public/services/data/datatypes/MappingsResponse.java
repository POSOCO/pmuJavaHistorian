
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
 *         &lt;element name="overviewStateIdList" type="{http://www.eterra.com/public/services/data/dataTypes}IdCollection" minOccurs="0"/>
 *         &lt;element name="compositeEventIdList" type="{http://www.eterra.com/public/services/data/dataTypes}IdCollection" minOccurs="0"/>
 *         &lt;element name="angleMappingList" type="{http://www.eterra.com/public/services/data/dataTypes}AngleMappingList" minOccurs="0"/>
 *         &lt;element name="interchangeMappingList" type="{http://www.eterra.com/public/services/data/dataTypes}InterchangeMappingList" minOccurs="0"/>
 *         &lt;element name="rocMappingList" type="{http://www.eterra.com/public/services/data/dataTypes}RocMappingList" minOccurs="0"/>
 *         &lt;element name="nameMappingList" type="{http://www.eterra.com/public/services/data/dataTypes}NameMappingList" minOccurs="0"/>
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
    "overviewStateIdList",
    "compositeEventIdList",
    "angleMappingList",
    "interchangeMappingList",
    "rocMappingList",
    "nameMappingList"
})
@XmlRootElement(name = "MappingsResponse")
public class MappingsResponse {

    protected IdCollection overviewStateIdList;
    protected IdCollection compositeEventIdList;
    protected AngleMappingList angleMappingList;
    protected InterchangeMappingList interchangeMappingList;
    protected RocMappingList rocMappingList;
    protected NameMappingList nameMappingList;

    /**
     * Gets the value of the overviewStateIdList property.
     * 
     * @return
     *     possible object is
     *     {@link IdCollection }
     *     
     */
    public IdCollection getOverviewStateIdList() {
        return overviewStateIdList;
    }

    /**
     * Sets the value of the overviewStateIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdCollection }
     *     
     */
    public void setOverviewStateIdList(IdCollection value) {
        this.overviewStateIdList = value;
    }

    /**
     * Gets the value of the compositeEventIdList property.
     * 
     * @return
     *     possible object is
     *     {@link IdCollection }
     *     
     */
    public IdCollection getCompositeEventIdList() {
        return compositeEventIdList;
    }

    /**
     * Sets the value of the compositeEventIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdCollection }
     *     
     */
    public void setCompositeEventIdList(IdCollection value) {
        this.compositeEventIdList = value;
    }

    /**
     * Gets the value of the angleMappingList property.
     * 
     * @return
     *     possible object is
     *     {@link AngleMappingList }
     *     
     */
    public AngleMappingList getAngleMappingList() {
        return angleMappingList;
    }

    /**
     * Sets the value of the angleMappingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleMappingList }
     *     
     */
    public void setAngleMappingList(AngleMappingList value) {
        this.angleMappingList = value;
    }

    /**
     * Gets the value of the interchangeMappingList property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeMappingList }
     *     
     */
    public InterchangeMappingList getInterchangeMappingList() {
        return interchangeMappingList;
    }

    /**
     * Sets the value of the interchangeMappingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeMappingList }
     *     
     */
    public void setInterchangeMappingList(InterchangeMappingList value) {
        this.interchangeMappingList = value;
    }

    /**
     * Gets the value of the rocMappingList property.
     * 
     * @return
     *     possible object is
     *     {@link RocMappingList }
     *     
     */
    public RocMappingList getRocMappingList() {
        return rocMappingList;
    }

    /**
     * Sets the value of the rocMappingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RocMappingList }
     *     
     */
    public void setRocMappingList(RocMappingList value) {
        this.rocMappingList = value;
    }

    /**
     * Gets the value of the nameMappingList property.
     * 
     * @return
     *     possible object is
     *     {@link NameMappingList }
     *     
     */
    public NameMappingList getNameMappingList() {
        return nameMappingList;
    }

    /**
     * Sets the value of the nameMappingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameMappingList }
     *     
     */
    public void setNameMappingList(NameMappingList value) {
        this.nameMappingList = value;
    }

}
