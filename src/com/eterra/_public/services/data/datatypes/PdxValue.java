
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdxValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PdxValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="f"/>
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="d"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PdxValue")
@XmlEnum
public enum PdxValue {

    @XmlEnumValue("f")
    F("f"),
    @XmlEnumValue("a")
    A("a"),
    @XmlEnumValue("d")
    D("d");
    private final String value;

    PdxValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PdxValue fromValue(String v) {
        for (PdxValue c: PdxValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
