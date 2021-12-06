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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFSPurchaseStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFSPurchaseStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Horizon.ExternalServices.AFS}AFSObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeclineReasons" type="{http://Horizon.ExternalServices.AFS}ArrayOfAFSPurchaseDeclineReason" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseStatus" type="{http://Horizon.ExternalServices.AFS}AFSPurchaseStatusCodes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFSPurchaseStatus", namespace = "http://Horizon.ExternalServices.AFS", propOrder = {
    "declineReasons",
    "purchaseStatus"
})
public class AFSPurchaseStatus
    extends AFSObjectBase
{

    @XmlElementRef(name = "DeclineReasons", namespace = "http://Horizon.ExternalServices.AFS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAFSPurchaseDeclineReason> declineReasons;
    @XmlElement(name = "PurchaseStatus")
    @XmlSchemaType(name = "string")
    protected AFSPurchaseStatusCodes purchaseStatus;

    /**
     * Gets the value of the declineReasons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAFSPurchaseDeclineReason }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAFSPurchaseDeclineReason> getDeclineReasons() {
        return declineReasons;
    }

    /**
     * Sets the value of the declineReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAFSPurchaseDeclineReason }{@code >}
     *     
     */
    public void setDeclineReasons(JAXBElement<ArrayOfAFSPurchaseDeclineReason> value) {
        this.declineReasons = value;
    }

    /**
     * Gets the value of the purchaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AFSPurchaseStatusCodes }
     *     
     */
    public AFSPurchaseStatusCodes getPurchaseStatus() {
        return purchaseStatus;
    }

    /**
     * Sets the value of the purchaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFSPurchaseStatusCodes }
     *     
     */
    public void setPurchaseStatus(AFSPurchaseStatusCodes value) {
        this.purchaseStatus = value;
    }

}
