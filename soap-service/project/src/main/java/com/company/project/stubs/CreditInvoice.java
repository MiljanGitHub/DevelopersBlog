//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.24 at 07:46:24 PM CET 
//


package com.company.project.stubs;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user" type="{http://Horizon.ExternalServices.AFS}AFSUser" minOccurs="0"/&gt;
 *         &lt;element name="creditNote" type="{http://Horizon.ExternalServices.AFS}AFSInvoice" minOccurs="0"/&gt;
 *         &lt;element name="invoiceToCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountToCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "user",
    "creditNote",
    "invoiceToCredit",
    "amountToCredit"
})
@XmlRootElement(name = "CreditInvoice")
public class CreditInvoice {

    @XmlElementRef(name = "user", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSUser> user;
    @XmlElementRef(name = "creditNote", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSInvoice> creditNote;
    @XmlElementRef(name = "invoiceToCredit", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceToCredit;
    protected BigDecimal amountToCredit;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSUser }{@code >}
     *     
     */
    public JAXBElement<AFSUser> getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSUser }{@code >}
     *     
     */
    public void setUser(JAXBElement<AFSUser> value) {
        this.user = value;
    }

    /**
     * Gets the value of the creditNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSInvoice }{@code >}
     *     
     */
    public JAXBElement<AFSInvoice> getCreditNote() {
        return creditNote;
    }

    /**
     * Sets the value of the creditNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSInvoice }{@code >}
     *     
     */
    public void setCreditNote(JAXBElement<AFSInvoice> value) {
        this.creditNote = value;
    }

    /**
     * Gets the value of the invoiceToCredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceToCredit() {
        return invoiceToCredit;
    }

    /**
     * Sets the value of the invoiceToCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceToCredit(JAXBElement<String> value) {
        this.invoiceToCredit = value;
    }

    /**
     * Gets the value of the amountToCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountToCredit() {
        return amountToCredit;
    }

    /**
     * Sets the value of the amountToCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountToCredit(BigDecimal value) {
        this.amountToCredit = value;
    }

}
