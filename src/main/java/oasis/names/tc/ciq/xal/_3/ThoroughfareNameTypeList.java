//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.23 at 05:44:00 PM EET 
//


package oasis.names.tc.ciq.xal._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThoroughfareNameTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThoroughfareNameTypeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="NameOnly"/>
 *     &lt;enumeration value="PreDirection"/>
 *     &lt;enumeration value="PostDirection"/>
 *     &lt;enumeration value="NameAndNumber"/>
 *     &lt;enumeration value="NameAndType"/>
 *     &lt;enumeration value="NameNumberAndType"/>
 *     &lt;enumeration value="Unstructured"/>
 *     &lt;enumeration value="SubThoroughfareConnector"/>
 *     &lt;enumeration value="ReferenceLocation"/>
 *     &lt;enumeration value="Type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThoroughfareNameTypeList")
@XmlEnum
public enum ThoroughfareNameTypeList {


    /**
     * Just the name part, such as Baker in Baker Street.
     * 
     */
    @XmlEnumValue("NameOnly")
    NAME_ONLY("NameOnly"),

    /**
     * North Archer Street, where "North" is PreDirection
     * 
     */
    @XmlEnumValue("PreDirection")
    PRE_DIRECTION("PreDirection"),

    /**
     * Archer Street North, where "North" is PostDirection
     * 
     */
    @XmlEnumValue("PostDirection")
    POST_DIRECTION("PostDirection"),

    /**
     * This value indicates that the element contains the street name and street number. E.g. 39 Baker Street. Use this when you do not want to break the thoroughfare into atomic types
     * 
     */
    @XmlEnumValue("NameAndNumber")
    NAME_AND_NUMBER("NameAndNumber"),

    /**
     * Baker Street, where Baker is Name and Street is Type
     * 
     */
    @XmlEnumValue("NameAndType")
    NAME_AND_TYPE("NameAndType"),

    /**
     *  21 Archer Street (Full thoroughfare details)
     * 
     */
    @XmlEnumValue("NameNumberAndType")
    NAME_NUMBER_AND_TYPE("NameNumberAndType"),

    /**
     * Full details of a thorughfare in a single line (unstructured)
     * e.g. 39 Baker Street North
     * 
     */
    @XmlEnumValue("Unstructured")
    UNSTRUCTURED("Unstructured"),

    /**
     * When more than one street name is required to identify the location this type can be used to connect them with values such as CORNER OF or VIA.
     * 
     */
    @XmlEnumValue("SubThoroughfareConnector")
    SUB_THOROUGHFARE_CONNECTOR("SubThoroughfareConnector"),

    /**
     * Free text description of some other location and how this thoroughfare relates to it, e.g. 300m from water station, new the police station, etc.
     * 
     */
    @XmlEnumValue("ReferenceLocation")
    REFERENCE_LOCATION("ReferenceLocation"),

    /**
     * Additional description like intersection, cross streets, etc
     * 
     */
    @XmlEnumValue("Type")
    TYPE("Type");
    private final String value;

    ThoroughfareNameTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThoroughfareNameTypeList fromValue(String v) {
        for (ThoroughfareNameTypeList c: ThoroughfareNameTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
