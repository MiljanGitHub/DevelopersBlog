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
 *         &lt;element name="InsertInvoiceAndCustomerResult" type="{http://Horizon.ExternalServices.AFS}AFSInvoiceResponse" minOccurs="0"/&gt;
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
    "insertInvoiceAndCustomerResult"
})
@XmlRootElement(name = "InsertInvoiceAndCustomerResponse")
public class InsertInvoiceAndCustomerResponse {

    @XmlElementRef(name = "InsertInvoiceAndCustomerResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSInvoiceResponse> insertInvoiceAndCustomerResult;

    /**
     * Gets the value of the insertInvoiceAndCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSInvoiceResponse }{@code >}
     *     
     */
    public JAXBElement<AFSInvoiceResponse> getInsertInvoiceAndCustomerResult() {
        return insertInvoiceAndCustomerResult;
    }

    /**
     * Sets the value of the insertInvoiceAndCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSInvoiceResponse }{@code >}
     *     
     */
    public void setInsertInvoiceAndCustomerResult(JAXBElement<AFSInvoiceResponse> value) {
        this.insertInvoiceAndCustomerResult = value;
    }

}
