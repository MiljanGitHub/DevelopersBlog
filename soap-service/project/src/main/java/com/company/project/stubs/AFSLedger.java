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
 * <p>Java class for AFSLedger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFSLedger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Horizon.ExternalServices.AFS}AFSObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DueBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InterestAndFeeBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Vouchers" type="{http://Horizon.ExternalServices.AFS}ArrayOfAFSVoucher" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFSLedger", namespace = "http://Horizon.ExternalServices.AFS", propOrder = {
    "balance",
    "dueBalance",
    "interestAndFeeBalance",
    "invoiceBalance",
    "paymentBalance",
    "vouchers"
})
public class AFSLedger
    extends AFSObjectBase
{

    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "DueBalance")
    protected BigDecimal dueBalance;
    @XmlElement(name = "InterestAndFeeBalance")
    protected BigDecimal interestAndFeeBalance;
    @XmlElement(name = "InvoiceBalance")
    protected BigDecimal invoiceBalance;
    @XmlElement(name = "PaymentBalance")
    protected BigDecimal paymentBalance;
    @XmlElementRef(name = "Vouchers", namespace = "http://Horizon.ExternalServices.AFS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAFSVoucher> vouchers;

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the dueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDueBalance() {
        return dueBalance;
    }

    /**
     * Sets the value of the dueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDueBalance(BigDecimal value) {
        this.dueBalance = value;
    }

    /**
     * Gets the value of the interestAndFeeBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestAndFeeBalance() {
        return interestAndFeeBalance;
    }

    /**
     * Sets the value of the interestAndFeeBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestAndFeeBalance(BigDecimal value) {
        this.interestAndFeeBalance = value;
    }

    /**
     * Gets the value of the invoiceBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceBalance() {
        return invoiceBalance;
    }

    /**
     * Sets the value of the invoiceBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceBalance(BigDecimal value) {
        this.invoiceBalance = value;
    }

    /**
     * Gets the value of the paymentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentBalance() {
        return paymentBalance;
    }

    /**
     * Sets the value of the paymentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentBalance(BigDecimal value) {
        this.paymentBalance = value;
    }

    /**
     * Gets the value of the vouchers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAFSVoucher }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAFSVoucher> getVouchers() {
        return vouchers;
    }

    /**
     * Sets the value of the vouchers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAFSVoucher }{@code >}
     *     
     */
    public void setVouchers(JAXBElement<ArrayOfAFSVoucher> value) {
        this.vouchers = value;
    }

}