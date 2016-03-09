//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.23 at 05:44:00 PM EET 
//


package oasis.names.tc.ciq.xpil._3;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import oasis.names.tc.ciq.ct._3.DataQualityTypeList;
import oasis.names.tc.ciq.xnl._3.PartyNameType;


/**
 * A container for defining the unique characteristics of a party, which can be a person or organisation
 * 
 * <p>Java class for PartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}FreeTextLines" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{urn:oasis:names:tc:ciq:xnl:3}PartyNameType" minOccurs="0"/>
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
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}PersonInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}BirthInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}CountriesOfResidence" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Favourites" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Habits" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Hobbies" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Languages" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Nationalities" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Occupations" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}PhysicalInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Preferences" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Qualifications" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Visas" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grLanguageCode"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grValidityDate"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grDataQuality"/>
 *       &lt;attribute name="PartyType" type="{urn:oasis:names:tc:ciq:xpil:3}PartyTypeList" />
 *       &lt;attribute name="PartyID" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute name="PartyIDType" type="{urn:oasis:names:tc:ciq:xpil:3}PartyIDTypeList" />
 *       &lt;attribute name="ID" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute name="Usage" type="{urn:oasis:names:tc:ciq:xpil:3}PartyUsageList" />
 *       &lt;attribute name="Status" type="{urn:oasis:names:tc:ciq:ct:3}StatusList" />
 *       &lt;attribute name="PartyKey" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute name="PartyKeyRef" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute ref="{urn:www:w3:org:1999:xlink1}type"/>
 *       &lt;attribute ref="{urn:www:w3:org:1999:xlink1}label"/>
 *       &lt;attribute ref="{urn:www:w3:org:1999:xlink1}href"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyType", propOrder = {
    "freeTextLines",
    "partyName",
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
    "organisationInfo",
    "personInfo",
    "birthInfo",
    "countriesOfResidence",
    "favourites",
    "habits",
    "hobbies",
    "languages",
    "nationalities",
    "occupations",
    "physicalInfo",
    "preferences",
    "qualifications",
    "visas"
})
public class PartyType {

    @XmlElement(name = "FreeTextLines")
    protected FreeTextLines freeTextLines;
    @XmlElement(name = "PartyName")
    protected PartyNameType partyName;
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
    @XmlElement(name = "PersonInfo")
    protected PersonInfo personInfo;
    @XmlElement(name = "BirthInfo")
    protected BirthInfo birthInfo;
    @XmlElement(name = "CountriesOfResidence")
    protected CountriesOfResidence countriesOfResidence;
    @XmlElement(name = "Favourites")
    protected Favourites favourites;
    @XmlElement(name = "Habits")
    protected Habits habits;
    @XmlElement(name = "Hobbies")
    protected Hobbies hobbies;
    @XmlElement(name = "Languages")
    protected Languages languages;
    @XmlElement(name = "Nationalities")
    protected Nationalities nationalities;
    @XmlElement(name = "Occupations")
    protected Occupations occupations;
    @XmlElement(name = "PhysicalInfo")
    protected PhysicalInfo physicalInfo;
    @XmlElement(name = "Preferences")
    protected Preferences preferences;
    @XmlElement(name = "Qualifications")
    protected Qualifications qualifications;
    @XmlElement(name = "Visas")
    protected Visas visas;
    @XmlAttribute(name = "PartyType", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partyType;
    @XmlAttribute(name = "PartyID", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partyID;
    @XmlAttribute(name = "PartyIDType", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partyIDType;
    @XmlAttribute(name = "ID", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "Usage", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    protected String usage;
    @XmlAttribute(name = "Status", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    protected String status;
    @XmlAttribute(name = "PartyKey", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partyKey;
    @XmlAttribute(name = "PartyKeyRef", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partyKeyRef;
    @XmlAttribute(name = "type", namespace = "urn:www:w3:org:1999:xlink1")
    protected String type;
    @XmlAttribute(name = "label", namespace = "urn:www:w3:org:1999:xlink1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String label;
    @XmlAttribute(name = "href", namespace = "urn:www:w3:org:1999:xlink1")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "LanguageCode", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;
    @XmlAttribute(name = "DateValidFrom", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValidFrom;
    @XmlAttribute(name = "DateValidTo", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValidTo;
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
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link PartyNameType }
     *     
     */
    public PartyNameType getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyNameType }
     *     
     */
    public void setPartyName(PartyNameType value) {
        this.partyName = value;
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
     * Container for other organisation specific details that are not covered in this schema that are common to a party
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
     * Container for other person specific details that are not covered in this schema elements that are common to a party
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the birthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BirthInfo }
     *     
     */
    public BirthInfo getBirthInfo() {
        return birthInfo;
    }

    /**
     * Sets the value of the birthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthInfo }
     *     
     */
    public void setBirthInfo(BirthInfo value) {
        this.birthInfo = value;
    }

    /**
     * Gets the value of the countriesOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link CountriesOfResidence }
     *     
     */
    public CountriesOfResidence getCountriesOfResidence() {
        return countriesOfResidence;
    }

    /**
     * Sets the value of the countriesOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountriesOfResidence }
     *     
     */
    public void setCountriesOfResidence(CountriesOfResidence value) {
        this.countriesOfResidence = value;
    }

    /**
     * Gets the value of the favourites property.
     * 
     * @return
     *     possible object is
     *     {@link Favourites }
     *     
     */
    public Favourites getFavourites() {
        return favourites;
    }

    /**
     * Sets the value of the favourites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Favourites }
     *     
     */
    public void setFavourites(Favourites value) {
        this.favourites = value;
    }

    /**
     * Gets the value of the habits property.
     * 
     * @return
     *     possible object is
     *     {@link Habits }
     *     
     */
    public Habits getHabits() {
        return habits;
    }

    /**
     * Sets the value of the habits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Habits }
     *     
     */
    public void setHabits(Habits value) {
        this.habits = value;
    }

    /**
     * Gets the value of the hobbies property.
     * 
     * @return
     *     possible object is
     *     {@link Hobbies }
     *     
     */
    public Hobbies getHobbies() {
        return hobbies;
    }

    /**
     * Sets the value of the hobbies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hobbies }
     *     
     */
    public void setHobbies(Hobbies value) {
        this.hobbies = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link Languages }
     *     
     */
    public Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Languages }
     *     
     */
    public void setLanguages(Languages value) {
        this.languages = value;
    }

    /**
     * Gets the value of the nationalities property.
     * 
     * @return
     *     possible object is
     *     {@link Nationalities }
     *     
     */
    public Nationalities getNationalities() {
        return nationalities;
    }

    /**
     * Sets the value of the nationalities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nationalities }
     *     
     */
    public void setNationalities(Nationalities value) {
        this.nationalities = value;
    }

    /**
     * Gets the value of the occupations property.
     * 
     * @return
     *     possible object is
     *     {@link Occupations }
     *     
     */
    public Occupations getOccupations() {
        return occupations;
    }

    /**
     * Sets the value of the occupations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Occupations }
     *     
     */
    public void setOccupations(Occupations value) {
        this.occupations = value;
    }

    /**
     * Gets the value of the physicalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalInfo }
     *     
     */
    public PhysicalInfo getPhysicalInfo() {
        return physicalInfo;
    }

    /**
     * Sets the value of the physicalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalInfo }
     *     
     */
    public void setPhysicalInfo(PhysicalInfo value) {
        this.physicalInfo = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link Preferences }
     *     
     */
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preferences }
     *     
     */
    public void setPreferences(Preferences value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the qualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Qualifications }
     *     
     */
    public Qualifications getQualifications() {
        return qualifications;
    }

    /**
     * Sets the value of the qualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Qualifications }
     *     
     */
    public void setQualifications(Qualifications value) {
        this.qualifications = value;
    }

    /**
     * Gets the value of the visas property.
     * 
     * @return
     *     possible object is
     *     {@link Visas }
     *     
     */
    public Visas getVisas() {
        return visas;
    }

    /**
     * Sets the value of the visas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visas }
     *     
     */
    public void setVisas(Visas value) {
        this.visas = value;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the partyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyID() {
        return partyID;
    }

    /**
     * Sets the value of the partyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyID(String value) {
        this.partyID = value;
    }

    /**
     * Gets the value of the partyIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyIDType() {
        return partyIDType;
    }

    /**
     * Sets the value of the partyIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyIDType(String value) {
        this.partyIDType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * Gets the value of the partyKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyKey() {
        return partyKey;
    }

    /**
     * Sets the value of the partyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyKey(String value) {
        this.partyKey = value;
    }

    /**
     * Gets the value of the partyKeyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyKeyRef() {
        return partyKeyRef;
    }

    /**
     * Sets the value of the partyKeyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyKeyRef(String value) {
        this.partyKeyRef = value;
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
