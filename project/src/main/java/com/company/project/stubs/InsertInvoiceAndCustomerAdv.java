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
 *         &lt;element name="customer" type="{http://Horizon.ExternalServices.AFS}AFSCustomer" minOccurs="0"/&gt;
 *         &lt;element name="invoice" type="{http://Horizon.ExternalServices.AFS}AFSInvoice" minOccurs="0"/&gt;
 *         &lt;element name="printOptions" type="{http://Horizon.ExternalServices.AFS}AFSPrintOptions" minOccurs="0"/&gt;
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
    "customer",
    "invoice",
    "printOptions"
})
@XmlRootElement(name = "InsertInvoiceAndCustomerAdv")
public class InsertInvoiceAndCustomerAdv {

    @XmlElementRef(name = "user", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSUser> user;
    @XmlElementRef(name = "customer", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSCustomer> customer;
    @XmlElementRef(name = "invoice", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSInvoice> invoice;
    @XmlElementRef(name = "printOptions", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSPrintOptions> printOptions;

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
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSCustomer }{@code >}
     *     
     */
    public JAXBElement<AFSCustomer> getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSCustomer }{@code >}
     *     
     */
    public void setCustomer(JAXBElement<AFSCustomer> value) {
        this.customer = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSInvoice }{@code >}
     *     
     */
    public JAXBElement<AFSInvoice> getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSInvoice }{@code >}
     *     
     */
    public void setInvoice(JAXBElement<AFSInvoice> value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the printOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSPrintOptions }{@code >}
     *     
     */
    public JAXBElement<AFSPrintOptions> getPrintOptions() {
        return printOptions;
    }

    /**
     * Sets the value of the printOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSPrintOptions }{@code >}
     *     
     */
    public void setPrintOptions(JAXBElement<AFSPrintOptions> value) {
        this.printOptions = value;
    }

}
