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
 *         &lt;element name="orderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipment" type="{http://Horizon.ExternalServices.AFS}AFSOrderShipment" minOccurs="0"/&gt;
 *         &lt;element name="invoiceInfo" type="{http://Horizon.ExternalServices.AFS}AFSOrderShipmentInvoiceInfo" minOccurs="0"/&gt;
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
    "orderNo",
    "shipment",
    "invoiceInfo"
})
@XmlRootElement(name = "ShipOrderPartlyWithInvoiceInfo")
public class ShipOrderPartlyWithInvoiceInfo {

    @XmlElementRef(name = "user", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSUser> user;
    @XmlElementRef(name = "orderNo", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNo;
    @XmlElementRef(name = "shipment", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSOrderShipment> shipment;
    @XmlElementRef(name = "invoiceInfo", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSOrderShipmentInvoiceInfo> invoiceInfo;

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
     * Gets the value of the orderNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNo(JAXBElement<String> value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSOrderShipment }{@code >}
     *     
     */
    public JAXBElement<AFSOrderShipment> getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSOrderShipment }{@code >}
     *     
     */
    public void setShipment(JAXBElement<AFSOrderShipment> value) {
        this.shipment = value;
    }

    /**
     * Gets the value of the invoiceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSOrderShipmentInvoiceInfo }{@code >}
     *     
     */
    public JAXBElement<AFSOrderShipmentInvoiceInfo> getInvoiceInfo() {
        return invoiceInfo;
    }

    /**
     * Sets the value of the invoiceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSOrderShipmentInvoiceInfo }{@code >}
     *     
     */
    public void setInvoiceInfo(JAXBElement<AFSOrderShipmentInvoiceInfo> value) {
        this.invoiceInfo = value;
    }

}
