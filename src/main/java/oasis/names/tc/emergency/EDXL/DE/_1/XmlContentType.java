//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.01 at 03:33:45 PM EET 
//


package oasis.names.tc.emergency.EDXL.DE._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.emergency.edxl.have._1.HospitalStatus;


/**
 * <p>Java class for xmlContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmlContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyXMLContent" type="{urn:oasis:names:tc:emergency:EDXL:DE:1.0}anyXMLType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="embeddedXMLContent" type="{urn:oasis:names:tc:emergency:EDXL:DE:1.0}anyXMLType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmlContentType", propOrder = {
    "keyXMLContent",
    "embeddedXMLContent"
})
public class XmlContentType {

    protected List<AnyXMLType> keyXMLContent;
    protected List<AnyXMLType> embeddedXMLContent;
    //protected List<HospitalStatus> embeddedXMLContent;
    //protected List<HospitalStatusType> embeddedXMLContent;
    //protected HospitalStatus embeddedXMLContent;
    //protected String embeddedXMLContent;

    /**
     * Gets the value of the keyXMLContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyXMLContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyXMLContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyXMLType }
     * 
     * 
     */
    public List<AnyXMLType> getKeyXMLContent() {
        if (keyXMLContent == null) {
            keyXMLContent = new ArrayList<AnyXMLType>();
        }
        return this.keyXMLContent;
    }

    /*public String getEmbeddedXMLContent() {
        return embeddedXMLContent;
    }

    public void setEmbeddedXMLContent(String embeddedXMLContent) {
        this.embeddedXMLContent = embeddedXMLContent;
    }*/

    /*public List<HospitalStatus> getEmbeddedXMLContent() {
        return embeddedXMLContent;
    }

    public void setEmbeddedXMLContent(List<HospitalStatus> embeddedXMLContent) {
        this.embeddedXMLContent = embeddedXMLContent;
    }*/

    /*public HospitalStatus getEmbeddedXMLContent() {
        return embeddedXMLContent;
    }

    public void setEmbeddedXMLContent(HospitalStatus embeddedXMLContent) {
        this.embeddedXMLContent = embeddedXMLContent;
    }*/
    
    
    

    /**
     * Gets the value of the embeddedXMLContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the embeddedXMLContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmbeddedXMLContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyXMLType }
     * 
     * 
     */
    public List<AnyXMLType> getEmbeddedXMLContent() {
        if (embeddedXMLContent == null) {
            embeddedXMLContent = new ArrayList<AnyXMLType>();
        }
        return this.embeddedXMLContent;
    }

    public void setEmbeddedXMLContent(List<AnyXMLType> embeddedXMLContent) {
        this.embeddedXMLContent = embeddedXMLContent;
    }
    
    /*public List<HospitalStatusType> getEmbeddedXMLContent() {
        if (embeddedXMLContent == null) {
            embeddedXMLContent = new ArrayList<HospitalStatusType>();
        }
        return this.embeddedXMLContent;
    }

    public void setEmbeddedXMLContent(List<HospitalStatusType> embeddedXMLContent) {
        this.embeddedXMLContent = embeddedXMLContent;
    }*/
    
    
  
    
    
    
    
    

}
