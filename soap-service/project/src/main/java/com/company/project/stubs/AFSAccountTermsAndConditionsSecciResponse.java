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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFSAccountTermsAndConditionsSecciResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFSAccountTermsAndConditionsSecciResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Horizon.ExternalServices.AFS}AFSResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountTermsAndConditions" type="{http://Horizon.ExternalServices.AFS}AFSAccountTermsAndConditions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFSAccountTermsAndConditionsSecciResponse", namespace = "http://Horizon.ExternalServices.AFS", propOrder = {
    "accountTermsAndConditions"
})
public class AFSAccountTermsAndConditionsSecciResponse
    extends AFSResponseBase
{

    @XmlElementRef(name = "AccountTermsAndConditions", namespace = "http://Horizon.ExternalServices.AFS", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSAccountTermsAndConditions> accountTermsAndConditions;

    /**
     * Gets the value of the accountTermsAndConditions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSAccountTermsAndConditions }{@code >}
     *     
     */
    public JAXBElement<AFSAccountTermsAndConditions> getAccountTermsAndConditions() {
        return accountTermsAndConditions;
    }

    /**
     * Sets the value of the accountTermsAndConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSAccountTermsAndConditions }{@code >}
     *     
     */
    public void setAccountTermsAndConditions(JAXBElement<AFSAccountTermsAndConditions> value) {
        this.accountTermsAndConditions = value;
    }

}
