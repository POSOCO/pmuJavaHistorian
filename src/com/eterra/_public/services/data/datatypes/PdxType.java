
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PdxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PDX1"/>
 *     &lt;enumeration value="PDX2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PdxType")
@XmlEnum
public enum PdxType {

    @XmlEnumValue("PDX1")
    PDX_1("PDX1"),
    @XmlEnumValue("PDX2")
    PDX_2("PDX2");
    private final String value;

    PdxType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PdxType fromValue(String v) {
        for (PdxType c: PdxType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
