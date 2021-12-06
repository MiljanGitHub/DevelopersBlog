//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.24 at 07:46:24 PM CET 
//


package com.company.project.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFSUpdateCustomerEinvoiceInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFSUpdateCustomerEinvoiceInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Horizon.ExternalServices.AFS}AFSObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EinvoicePartyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Referencetype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFSUpdateCustomerEinvoiceInfoRequest", namespace = "http://Horizon.ExternalServices.AFS", propOrder = {
    "customerNo",
    "einvoicePartyId",
    "referenceID",
    "referencetype"
})
public class AFSUpdateCustomerEinvoiceInfoRequest
    extends AFSObjectBase
{

    @XmlElementRef(name = "CustomerNo", namespace = "http://Horizon.ExternalServices.AFS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerNo;
    @XmlElementRef(name = "EinvoicePartyId", namespace = "http://Horizon.ExternalServices.AFS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> einvoicePartyId;
    @XmlElementRef(name = "ReferenceID", namespace = "http://Horizon.ExternalServices.AFS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceID;
    @XmlElement(name = "Referencetype")
    protected Integer referencetype;

    /**
     * Gets the value of the customerNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerNo() {
        return customerNo;
    }

    /**
     * Sets the value of the customerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerNo(JAXBElement<String> value) {
        this.customerNo = value;
    }

    /**
     * Gets the value of the einvoicePartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEinvoicePartyId() {
        return einvoicePartyId;
    }

    /**
     * Sets the value of the einvoicePartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEinvoicePartyId(JAXBElement<String> value) {
        this.einvoicePartyId = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceID(JAXBElement<String> value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the referencetype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferencetype() {
        return referencetype;
    }

    /**
     * Sets the value of the referencetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferencetype(Integer value) {
        this.referencetype = value;
    }

}