//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.23 at 05:44:00 PM EET 
//


package oasis.names.tc.ciq.xpil._3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import oasis.names.tc.ciq.ct._3.DataQualityTypeList;
import oasis.names.tc.ciq.xnl._3.OrganisationNameType;
import oasis.names.tc.emergency.edxl.have._1.OrganizationInformation;


/**
 * A container for defining the unique characteristics of an organisation only
 * 
 * <p>Java class for OrganisationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}FreeTextLines" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xnl:3}OrganisationName" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Addresses" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Accounts" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}ContactNumbers" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Documents" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}ElectronicAddressIdentifiers" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Events" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Identifiers" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Memberships" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Relationships" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Revenues" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Stocks" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Vehicles" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}OrganisationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grValidityDate"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grLanguageCode"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grDataQuality"/>
 *       &lt;attribute name="Usage" type="{urn:oasis:names:tc:ciq:xpil:3}OrganisationDetailsUsageList" />
 *       &lt;attribute name="Status" type="{urn:oasis:names:tc:ciq:ct:3}StatusList" />
 *       &lt;attribute name="OrganisationDetailsKey" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute name="OrganisationDetailsKeyRef" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute ref="{urn:www:w3:org:1999:xlink1}type"/>
 *       &lt;attribute ref="{urn:www:w3:org:1999:xlink1}label"/>
 *       &lt;attribute ref="{urn:www:w3:org:1999:xlink1}href"/>
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationDetailsType", propOrder = {
    "freeTextLines",
    "organisationName",
    "addresses",
    "accounts",
    "contactNumbers",
    "documents",
    "electronicAddressIdentifiers",
    "events",
    "identifiers",
    "memberships",
    "relationships",
    "revenues",
    "stocks",
    "vehicles",
    "organisationInfo"
})
@XmlSeeAlso({
    OrganizationInformation.class
})
public class OrganisationDetailsType {

    @XmlElement(name = "FreeTextLines")
    protected FreeTextLines freeTextLines;
    @XmlElement(name = "OrganisationName", namespace = "urn:oasis:names:tc:ciq:xnl:3", required = true)
    protected List<OrganisationNameType> organisationName;
    @XmlElement(name = "Addresses")
    protected Addresses addresses;
    @XmlElement(name = "Accounts")
    protected Accounts accounts;
    @XmlElement(name = "ContactNumbers")
    protected ContactNumbers contactNumbers;
    @XmlElement(name = "Documents")
    protected Documents documents;
    @XmlElement(name = "ElectronicAddressIdentifiers")
    protected ElectronicAddressIdentifiers electronicAddressIdentifiers;
    @XmlElement(name = "Events")
    protected Events events;
    @XmlElement(name = "Identifiers")
    protected Identifiers identifiers;
    @XmlElement(name = "Memberships")
    protected Memberships memberships;
    @XmlElement(name = "Relationships")
    protected Relationships relationships;
    @XmlElement(name = "Revenues")
    protected Revenues revenues;
    @XmlElement(name = "Stocks")
    protected Stocks stocks;
    @XmlElement(name = "Vehicles")
    protected Vehicles vehicles;
    @XmlElement(name = "OrganisationInfo")
    protected OrganisationInfo organisationInfo;
    @XmlAttribute(name = "Usage", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    protected String usage;
    @XmlAttribute(name = "Status", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    protected String status;
    @XmlAttribute(name = "OrganisationDetailsKey", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String organisationDetailsKey;
    @XmlAttribute(name = "OrganisationDetailsKeyRef", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String organisationDetailsKeyRef;
    @XmlAttribute(name = "type", namespace = "urn:www:w3:org:1999:xlink1")
    protected String type;
    @XmlAttribute(name = "label", namespace = "urn:www:w3:org:1999:xlink1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String label;
    @XmlAttribute(name = "href", namespace = "urn:www:w3:org:1999:xlink1")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "DateValidFrom", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValidFrom;
    @XmlAttribute(name = "DateValidTo", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValidTo;
    @XmlAttribute(name = "LanguageCode", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;
    @XmlAttribute(name = "DataQualityType", namespace = "urn:oasis:names:tc:ciq:ct:3")
    protected DataQualityTypeList dataQualityType;
    @XmlAttribute(name = "ValidFrom", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlAttribute(name = "ValidTo", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the freeTextLines property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextLines }
     *     
     */
    public FreeTextLines getFreeTextLines() {
        return freeTextLines;
    }

    /**
     * Sets the value of the freeTextLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextLines }
     *     
     */
    public void setFreeTextLines(FreeTextLines value) {
        this.freeTextLines = value;
    }

    /**
     * Gets the value of the organisationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationNameType }
     * 
     * 
     */
    public List<OrganisationNameType> getOrganisationName() {
        if (organisationName == null) {
            organisationName = new ArrayList<OrganisationNameType>();
        }
        return this.organisationName;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link Addresses }
     *     
     */
    public Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addresses }
     *     
     */
    public void setAddresses(Addresses value) {
        this.addresses = value;
    }

    /**
     * A container to define the accounts details of the party such as utility account, financil accounts
     * 
     * @return
     *     possible object is
     *     {@link Accounts }
     *     
     */
    public Accounts getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accounts }
     *     
     */
    public void setAccounts(Accounts value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the contactNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ContactNumbers }
     *     
     */
    public ContactNumbers getContactNumbers() {
        return contactNumbers;
    }

    /**
     * Sets the value of the contactNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactNumbers }
     *     
     */
    public void setContactNumbers(ContactNumbers value) {
        this.contactNumbers = value;
    }

    /**
     * A container for identification document and cards of the party that are unique to the party. e.g. license, identification card, credit card, etc
     * 
     * @return
     *     possible object is
     *     {@link Documents }
     *     
     */
    public Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documents }
     *     
     */
    public void setDocuments(Documents value) {
        this.documents = value;
    }

    /**
     * Gets the value of the electronicAddressIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicAddressIdentifiers }
     *     
     */
    public ElectronicAddressIdentifiers getElectronicAddressIdentifiers() {
        return electronicAddressIdentifiers;
    }

    /**
     * Sets the value of the electronicAddressIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicAddressIdentifiers }
     *     
     */
    public void setElectronicAddressIdentifiers(ElectronicAddressIdentifiers value) {
        this.electronicAddressIdentifiers = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link Events }
     *     
     */
    public Events getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link Events }
     *     
     */
    public void setEvents(Events value) {
        this.events = value;
    }

    /**
     * Gets the value of the identifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getIdentifiers() {
        return identifiers;
    }

    /**
     * Sets the value of the identifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setIdentifiers(Identifiers value) {
        this.identifiers = value;
    }

    /**
     * A container for memberships of party with other organisations (e.g. industry groups) or social networks (clubs, association, etc)
     * 
     * @return
     *     possible object is
     *     {@link Memberships }
     *     
     */
    public Memberships getMemberships() {
        return memberships;
    }

    /**
     * Sets the value of the memberships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Memberships }
     *     
     */
    public void setMemberships(Memberships value) {
        this.memberships = value;
    }

    /**
     * Relationships with other parties (persons or organisations, and the nature of relationship). Examples:
     * - For person: Contacts, blood relatives, friends, referees, customers, etc
     * - for Organisation: Subsidiary, Parent company, Branches, Divisions, Partners, etc
     * 
     * @return
     *     possible object is
     *     {@link Relationships }
     *     
     */
    public Relationships getRelationships() {
        return relationships;
    }

    /**
     * Sets the value of the relationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationships }
     *     
     */
    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

    /**
     * Container for income / revenue information of the party (salary/organisation revenue)
     * 
     * @return
     *     possible object is
     *     {@link Revenues }
     *     
     */
    public Revenues getRevenues() {
        return revenues;
    }

    /**
     * Sets the value of the revenues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revenues }
     *     
     */
    public void setRevenues(Revenues value) {
        this.revenues = value;
    }

    /**
     * Gets the value of the stocks property.
     * 
     * @return
     *     possible object is
     *     {@link Stocks }
     *     
     */
    public Stocks getStocks() {
        return stocks;
    }

    /**
     * Sets the value of the stocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stocks }
     *     
     */
    public void setStocks(Stocks value) {
        this.stocks = value;
    }

    /**
     * Gets the value of the vehicles property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicles }
     *     
     */
    public Vehicles getVehicles() {
        return vehicles;
    }

    /**
     * Sets the value of the vehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicles }
     *     
     */
    public void setVehicles(Vehicles value) {
        this.vehicles = value;
    }

    /**
     * Container for other person specific details that are not covered in this schema elements that are common to a party
     * 
     * @return
     *     possible object is
     *     {@link OrganisationInfo }
     *     
     */
    public OrganisationInfo getOrganisationInfo() {
        return organisationInfo;
    }

    /**
     * Sets the value of the organisationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationInfo }
     *     
     */
    public void setOrganisationInfo(OrganisationInfo value) {
        this.organisationInfo = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the organisationDetailsKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationDetailsKey() {
        return organisationDetailsKey;
    }

    /**
     * Sets the value of the organisationDetailsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationDetailsKey(String value) {
        this.organisationDetailsKey = value;
    }

    /**
     * Gets the value of the organisationDetailsKeyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationDetailsKeyRef() {
        return organisationDetailsKeyRef;
    }

    /**
     * Sets the value of the organisationDetailsKeyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationDetailsKeyRef(String value) {
        this.organisationDetailsKeyRef = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the dateValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValidFrom() {
        return dateValidFrom;
    }

    /**
     * Sets the value of the dateValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValidFrom(XMLGregorianCalendar value) {
        this.dateValidFrom = value;
    }

    /**
     * Gets the value of the dateValidTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValidTo() {
        return dateValidTo;
    }

    /**
     * Sets the value of the dateValidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValidTo(XMLGregorianCalendar value) {
        this.dateValidTo = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the dataQualityType property.
     * 
     * @return
     *     possible object is
     *     {@link DataQualityTypeList }
     *     
     */
    public DataQualityTypeList getDataQualityType() {
        return dataQualityType;
    }

    /**
     * Sets the value of the dataQualityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataQualityTypeList }
     *     
     */
    public void setDataQualityType(DataQualityTypeList value) {
        this.dataQualityType = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
