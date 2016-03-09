//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.23 at 05:44:00 PM EET 
//


package oasis.names.tc.emergency.edxl.have._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The number of each triage patient type the overall hospital currently has.
 * 
 * <p>Java class for TriageCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriageCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TriageCodeListURN" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="TriageCode" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="TriageCodeValue" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;enumeration value="Red"/>
 *                           &lt;enumeration value="Yellow"/>
 *                           &lt;enumeration value="Green"/>
 *                           &lt;enumeration value="Black"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="TriageCountQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriageCount", propOrder = {
    "triageCodeListURN",
    "triageCode"
})
public class TriageCount {

    @XmlElement(name = "TriageCodeListURN", defaultValue = "urn:oasis:names:tc:emergency:have:1.0:triagecolorcode")
    @XmlSchemaType(name = "anyURI")
    protected String triageCodeListURN;
    @XmlElement(name = "TriageCode")
    protected List<TriageCount.TriageCode> triageCode;

    /**
     * Gets the value of the triageCodeListURN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriageCodeListURN() {
        return triageCodeListURN;
    }

    /**
     * Sets the value of the triageCodeListURN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriageCodeListURN(String value) {
        this.triageCodeListURN = value;
    }

    /**
     * Gets the value of the triageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the triageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTriageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TriageCount.TriageCode }
     * 
     * 
     */
    public List<TriageCount.TriageCode> getTriageCode() {
        if (triageCode == null) {
            triageCode = new ArrayList<TriageCount.TriageCode>();
        }
        return this.triageCode;
    }


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
     *         &lt;element name="TriageCodeValue" maxOccurs="unbounded" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Red"/>
     *               &lt;enumeration value="Yellow"/>
     *               &lt;enumeration value="Green"/>
     *               &lt;enumeration value="Black"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TriageCountQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
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
        "triageCodeValue",
        "triageCountQuantity"
    })
    public static class TriageCode {

        @XmlElement(name = "TriageCodeValue")
        protected List<String> triageCodeValue;
        @XmlElement(name = "TriageCountQuantity")
        protected List<BigInteger> triageCountQuantity;

        /**
         * Gets the value of the triageCodeValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the triageCodeValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTriageCodeValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTriageCodeValue() {
            if (triageCodeValue == null) {
                triageCodeValue = new ArrayList<String>();
            }
            return this.triageCodeValue;
        }

        /**
         * Gets the value of the triageCountQuantity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the triageCountQuantity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTriageCountQuantity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getTriageCountQuantity() {
            if (triageCountQuantity == null) {
                triageCountQuantity = new ArrayList<BigInteger>();
            }
            return this.triageCountQuantity;
        }

    }

}
