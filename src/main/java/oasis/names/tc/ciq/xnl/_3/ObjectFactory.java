//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.23 at 05:44:00 PM EET 
//


package oasis.names.tc.ciq.xnl._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.tc.ciq.xnl._3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PartyName_QNAME = new QName("urn:oasis:names:tc:ciq:xnl:3", "PartyName");
    private final static QName _PersonName_QNAME = new QName("urn:oasis:names:tc:ciq:xnl:3", "PersonName");
    private final static QName _OrganisationName_QNAME = new QName("urn:oasis:names:tc:ciq:xnl:3", "OrganisationName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.tc.ciq.xnl._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PartyNameType }
     * 
     */
    public PartyNameType createPartyNameType() {
        return new PartyNameType();
    }

    /**
     * Create an instance of {@link OrganisationNameType }
     * 
     */
    public OrganisationNameType createOrganisationNameType() {
        return new OrganisationNameType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link NameLine }
     * 
     */
    public NameLine createNameLine() {
        return new NameLine();
    }

    /**
     * Create an instance of {@link PartyNameType.PersonName }
     * 
     */
    public PartyNameType.PersonName createPartyNameTypePersonName() {
        return new PartyNameType.PersonName();
    }

    /**
     * Create an instance of {@link PartyNameType.OrganisationName }
     * 
     */
    public PartyNameType.OrganisationName createPartyNameTypeOrganisationName() {
        return new PartyNameType.OrganisationName();
    }

    /**
     * Create an instance of {@link OrganisationNameType.NameElement }
     * 
     */
    public OrganisationNameType.NameElement createOrganisationNameTypeNameElement() {
        return new OrganisationNameType.NameElement();
    }

    /**
     * Create an instance of {@link OrganisationNameType.SubDivisionName }
     * 
     */
    public OrganisationNameType.SubDivisionName createOrganisationNameTypeSubDivisionName() {
        return new OrganisationNameType.SubDivisionName();
    }

    /**
     * Create an instance of {@link PersonNameType.NameElement }
     * 
     */
    public PersonNameType.NameElement createPersonNameTypeNameElement() {
        return new PersonNameType.NameElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ciq:xnl:3", name = "PartyName")
    public JAXBElement<PartyNameType> createPartyName(PartyNameType value) {
        return new JAXBElement<PartyNameType>(_PartyName_QNAME, PartyNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ciq:xnl:3", name = "PersonName")
    public JAXBElement<PersonNameType> createPersonName(PersonNameType value) {
        return new JAXBElement<PersonNameType>(_PersonName_QNAME, PersonNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ciq:xnl:3", name = "OrganisationName")
    public JAXBElement<OrganisationNameType> createOrganisationName(OrganisationNameType value) {
        return new JAXBElement<OrganisationNameType>(_OrganisationName_QNAME, OrganisationNameType.class, null, value);
    }

}
