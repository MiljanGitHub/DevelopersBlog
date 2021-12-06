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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFSInvoiceCreditResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFSInvoiceCreditResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Horizon.ExternalServices.AFS}AFSInvoiceGetResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditNote" type="{http://Horizon.ExternalServices.AFS}AFSInvoiceOutput" minOccurs="0"/&gt;
 *         &lt;element name="CreditedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFSInvoiceCreditResponse", namespace = "http://Horizon.ExternalServices.AFS", propOrder = {
    "creditNote",
    "creditedAmount"
})
public class AFSInvoiceCreditResponse
    extends AFSInvoiceGetResponse
{

    @XmlElementRef(name = "CreditNote", namespace = "http://Horizon.ExternalServices.AFS", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSInvoiceOutput> creditNote;
    @XmlElement(name = "CreditedAmount")
    protected BigDecimal creditedAmount;

    /**
     * Gets the value of the creditNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSInvoiceOutput }{@code >}
     *     
     */
    public JAXBElement<AFSInvoiceOutput> getCreditNote() {
        return creditNote;
    }

    /**
     * Sets the value of the creditNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSInvoiceOutput }{@code >}
     *     
     */
    public void setCreditNote(JAXBElement<AFSInvoiceOutput> value) {
        this.creditNote = value;
    }

    /**
     * Gets the value of the creditedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditedAmount() {
        return creditedAmount;
    }

    /**
     * Sets the value of the creditedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditedAmount(BigDecimal value) {
        this.creditedAmount = value;
    }

}
