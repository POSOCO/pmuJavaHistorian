
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Added"/>
 *     &lt;enumeration value="Removed"/>
 *     &lt;enumeration value="Offline"/>
 *     &lt;enumeration value="Normal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameState")
@XmlEnum
public enum NameState {

    @XmlEnumValue("Added")
    ADDED("Added"),
    @XmlEnumValue("Removed")
    REMOVED("Removed"),
    @XmlEnumValue("Offline")
    OFFLINE("Offline"),
    @XmlEnumValue("Normal")
    NORMAL("Normal");
    private final String value;

    NameState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameState fromValue(String v) {
        for (NameState c: NameState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
