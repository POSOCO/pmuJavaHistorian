
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ROC_HIGH"/>
 *     &lt;enumeration value="ROC_LOW"/>
 *     &lt;enumeration value="ROC_NONE"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="GenLoss"/>
 *     &lt;enumeration value="LoadLoss"/>
 *     &lt;enumeration value="LineLoss"/>
 *     &lt;enumeration value="FrequencyDisturbance"/>
 *     &lt;enumeration value="AngleDisturbance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventType")
@XmlEnum
public enum EventType {

    ROC_HIGH("ROC_HIGH"),
    ROC_LOW("ROC_LOW"),
    ROC_NONE("ROC_NONE"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("GenLoss")
    GEN_LOSS("GenLoss"),
    @XmlEnumValue("LoadLoss")
    LOAD_LOSS("LoadLoss"),
    @XmlEnumValue("LineLoss")
    LINE_LOSS("LineLoss"),
    @XmlEnumValue("FrequencyDisturbance")
    FREQUENCY_DISTURBANCE("FrequencyDisturbance"),
    @XmlEnumValue("AngleDisturbance")
    ANGLE_DISTURBANCE("AngleDisturbance");
    private final String value;

    EventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventType fromValue(String v) {
        for (EventType c: EventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
