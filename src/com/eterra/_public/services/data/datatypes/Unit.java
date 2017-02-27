
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Unit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Unit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MW"/>
 *     &lt;enumeration value="MVAR"/>
 *     &lt;enumeration value="MVA"/>
 *     &lt;enumeration value="Degrees"/>
 *     &lt;enumeration value="Radians"/>
 *     &lt;enumeration value="Hz"/>
 *     &lt;enumeration value="Amps"/>
 *     &lt;enumeration value="kV"/>
 *     &lt;enumeration value="Hz/s"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Unit")
@XmlEnum
public enum Unit {

    MW("MW"),
    MVAR("MVAR"),
    MVA("MVA"),
    @XmlEnumValue("Degrees")
    DEGREES("Degrees"),
    @XmlEnumValue("Radians")
    RADIANS("Radians"),
    @XmlEnumValue("Hz")
    HZ("Hz"),
    @XmlEnumValue("Amps")
    AMPS("Amps"),
    @XmlEnumValue("kV")
    K_V("kV"),
    @XmlEnumValue("Hz/s")
    HZ_S("Hz/s");
    private final String value;

    Unit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Unit fromValue(String v) {
        for (Unit c: Unit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
