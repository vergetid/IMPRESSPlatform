//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.01 at 03:33:45 PM EET 
//


package oasis.names.tc.emergency.EDXL.DE._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Exercise"/>
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Test"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusValues")
@XmlEnum
public enum StatusValues {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Exercise")
    EXERCISE("Exercise"),
    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Test")
    TEST("Test");
    private final String value;

    StatusValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusValues fromValue(String v) {
        for (StatusValues c: StatusValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
