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
 * <p>Java class for AFSCustomerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFSCustomerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Horizon.ExternalServices.AFS}AFSResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Customer" type="{http://Horizon.ExternalServices.AFS}AFSCustomerOutput" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryExternalProblem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFSCustomerResponse", namespace = "http://Horizon.ExternalServices.AFS", propOrder = {
    "customer",
    "temporaryExternalProblem"
})
public class AFSCustomerResponse
    extends AFSResponseBase
{

    @XmlElementRef(name = "Customer", namespace = "http://Horizon.ExternalServices.AFS", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSCustomerOutput> customer;
    @XmlElement(name = "TemporaryExternalProblem")
    protected Boolean temporaryExternalProblem;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSCustomerOutput }{@code >}
     *     
     */
    public JAXBElement<AFSCustomerOutput> getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSCustomerOutput }{@code >}
     *     
     */
    public void setCustomer(JAXBElement<AFSCustomerOutput> value) {
        this.customer = value;
    }

    /**
     * Gets the value of the temporaryExternalProblem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemporaryExternalProblem() {
        return temporaryExternalProblem;
    }

    /**
     * Sets the value of the temporaryExternalProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemporaryExternalProblem(Boolean value) {
        this.temporaryExternalProblem = value;
    }

}
