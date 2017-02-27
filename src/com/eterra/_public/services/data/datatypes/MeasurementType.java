
package com.eterra._public.services.data.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Positive_Sequence_Voltage_Magnitude"/>
 *     &lt;enumeration value="Positive_Sequence_Voltage_Angle"/>
 *     &lt;enumeration value="Positive_Sequence_Current_Magnitude"/>
 *     &lt;enumeration value="Positive_Sequence_Current_Angle"/>
 *     &lt;enumeration value="Negative_Sequence_Voltage_Magnitude"/>
 *     &lt;enumeration value="Negative_Sequence_Voltage_Angle"/>
 *     &lt;enumeration value="Negative_Sequence_Current_Magnitude"/>
 *     &lt;enumeration value="Negative_Sequence_Current_Angle"/>
 *     &lt;enumeration value="Zero_Sequence_Voltage_Magnitude"/>
 *     &lt;enumeration value="Zero_Sequence_Voltage_Angle"/>
 *     &lt;enumeration value="Zero_Sequence_Current_Magnitude"/>
 *     &lt;enumeration value="Zero_Sequence_Current_Angle"/>
 *     &lt;enumeration value="PhaseA_Voltage_Magnitude"/>
 *     &lt;enumeration value="PhaseA_Voltage_Angle"/>
 *     &lt;enumeration value="PhaseA_Current_Magnitude"/>
 *     &lt;enumeration value="PhaseA_Current_Angle"/>
 *     &lt;enumeration value="PhaseB_Voltage_Magnitude"/>
 *     &lt;enumeration value="PhaseB_Voltage_Angle"/>
 *     &lt;enumeration value="PhaseB_Current_Magnitude"/>
 *     &lt;enumeration value="PhaseB_Current_Angle"/>
 *     &lt;enumeration value="PhaseC_Voltage_Magnitude"/>
 *     &lt;enumeration value="PhaseC_Voltage_Angle"/>
 *     &lt;enumeration value="PhaseC_Current_Magnitude"/>
 *     &lt;enumeration value="PhaseC_Current_Angle"/>
 *     &lt;enumeration value="Frequency"/>
 *     &lt;enumeration value="DFDT"/>
 *     &lt;enumeration value="Analog"/>
 *     &lt;enumeration value="Single_Digital"/>
 *     &lt;enumeration value="Double_Digital"/>
 *     &lt;enumeration value="Reference_Angle"/>
 *     &lt;enumeration value="Angle_Difference"/>
 *     &lt;enumeration value="MW_Line"/>
 *     &lt;enumeration value="MVar_Line"/>
 *     &lt;enumeration value="MW_Corridor"/>
 *     &lt;enumeration value="MVar_Corridor"/>
 *     &lt;enumeration value="User_Defined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasurementType")
@XmlEnum
public enum MeasurementType {

    @XmlEnumValue("Positive_Sequence_Voltage_Magnitude")
    POSITIVE_SEQUENCE_VOLTAGE_MAGNITUDE("Positive_Sequence_Voltage_Magnitude"),
    @XmlEnumValue("Positive_Sequence_Voltage_Angle")
    POSITIVE_SEQUENCE_VOLTAGE_ANGLE("Positive_Sequence_Voltage_Angle"),
    @XmlEnumValue("Positive_Sequence_Current_Magnitude")
    POSITIVE_SEQUENCE_CURRENT_MAGNITUDE("Positive_Sequence_Current_Magnitude"),
    @XmlEnumValue("Positive_Sequence_Current_Angle")
    POSITIVE_SEQUENCE_CURRENT_ANGLE("Positive_Sequence_Current_Angle"),
    @XmlEnumValue("Negative_Sequence_Voltage_Magnitude")
    NEGATIVE_SEQUENCE_VOLTAGE_MAGNITUDE("Negative_Sequence_Voltage_Magnitude"),
    @XmlEnumValue("Negative_Sequence_Voltage_Angle")
    NEGATIVE_SEQUENCE_VOLTAGE_ANGLE("Negative_Sequence_Voltage_Angle"),
    @XmlEnumValue("Negative_Sequence_Current_Magnitude")
    NEGATIVE_SEQUENCE_CURRENT_MAGNITUDE("Negative_Sequence_Current_Magnitude"),
    @XmlEnumValue("Negative_Sequence_Current_Angle")
    NEGATIVE_SEQUENCE_CURRENT_ANGLE("Negative_Sequence_Current_Angle"),
    @XmlEnumValue("Zero_Sequence_Voltage_Magnitude")
    ZERO_SEQUENCE_VOLTAGE_MAGNITUDE("Zero_Sequence_Voltage_Magnitude"),
    @XmlEnumValue("Zero_Sequence_Voltage_Angle")
    ZERO_SEQUENCE_VOLTAGE_ANGLE("Zero_Sequence_Voltage_Angle"),
    @XmlEnumValue("Zero_Sequence_Current_Magnitude")
    ZERO_SEQUENCE_CURRENT_MAGNITUDE("Zero_Sequence_Current_Magnitude"),
    @XmlEnumValue("Zero_Sequence_Current_Angle")
    ZERO_SEQUENCE_CURRENT_ANGLE("Zero_Sequence_Current_Angle"),
    @XmlEnumValue("PhaseA_Voltage_Magnitude")
    PHASE_A_VOLTAGE_MAGNITUDE("PhaseA_Voltage_Magnitude"),
    @XmlEnumValue("PhaseA_Voltage_Angle")
    PHASE_A_VOLTAGE_ANGLE("PhaseA_Voltage_Angle"),
    @XmlEnumValue("PhaseA_Current_Magnitude")
    PHASE_A_CURRENT_MAGNITUDE("PhaseA_Current_Magnitude"),
    @XmlEnumValue("PhaseA_Current_Angle")
    PHASE_A_CURRENT_ANGLE("PhaseA_Current_Angle"),
    @XmlEnumValue("PhaseB_Voltage_Magnitude")
    PHASE_B_VOLTAGE_MAGNITUDE("PhaseB_Voltage_Magnitude"),
    @XmlEnumValue("PhaseB_Voltage_Angle")
    PHASE_B_VOLTAGE_ANGLE("PhaseB_Voltage_Angle"),
    @XmlEnumValue("PhaseB_Current_Magnitude")
    PHASE_B_CURRENT_MAGNITUDE("PhaseB_Current_Magnitude"),
    @XmlEnumValue("PhaseB_Current_Angle")
    PHASE_B_CURRENT_ANGLE("PhaseB_Current_Angle"),
    @XmlEnumValue("PhaseC_Voltage_Magnitude")
    PHASE_C_VOLTAGE_MAGNITUDE("PhaseC_Voltage_Magnitude"),
    @XmlEnumValue("PhaseC_Voltage_Angle")
    PHASE_C_VOLTAGE_ANGLE("PhaseC_Voltage_Angle"),
    @XmlEnumValue("PhaseC_Current_Magnitude")
    PHASE_C_CURRENT_MAGNITUDE("PhaseC_Current_Magnitude"),
    @XmlEnumValue("PhaseC_Current_Angle")
    PHASE_C_CURRENT_ANGLE("PhaseC_Current_Angle"),
    @XmlEnumValue("Frequency")
    FREQUENCY("Frequency"),
    DFDT("DFDT"),
    @XmlEnumValue("Analog")
    ANALOG("Analog"),
    @XmlEnumValue("Single_Digital")
    SINGLE_DIGITAL("Single_Digital"),
    @XmlEnumValue("Double_Digital")
    DOUBLE_DIGITAL("Double_Digital"),
    @XmlEnumValue("Reference_Angle")
    REFERENCE_ANGLE("Reference_Angle"),
    @XmlEnumValue("Angle_Difference")
    ANGLE_DIFFERENCE("Angle_Difference"),
    @XmlEnumValue("MW_Line")
    MW_LINE("MW_Line"),
    @XmlEnumValue("MVar_Line")
    M_VAR_LINE("MVar_Line"),
    @XmlEnumValue("MW_Corridor")
    MW_CORRIDOR("MW_Corridor"),
    @XmlEnumValue("MVar_Corridor")
    M_VAR_CORRIDOR("MVar_Corridor"),
    @XmlEnumValue("User_Defined")
    USER_DEFINED("User_Defined");
    private final String value;

    MeasurementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementType fromValue(String v) {
        for (MeasurementType c: MeasurementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
