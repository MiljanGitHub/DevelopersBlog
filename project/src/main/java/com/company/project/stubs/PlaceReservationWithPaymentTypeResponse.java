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
 *         &lt;element name="PlaceReservationWithPaymentTypeResult" type="{http://Horizon.ExternalServices.AFS}AFSReservationWithPaymentTypeResponse" minOccurs="0"/&gt;
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
    "placeReservationWithPaymentTypeResult"
})
@XmlRootElement(name = "PlaceReservationWithPaymentTypeResponse")
public class PlaceReservationWithPaymentTypeResponse {

    @XmlElementRef(name = "PlaceReservationWithPaymentTypeResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSReservationWithPaymentTypeResponse> placeReservationWithPaymentTypeResult;

    /**
     * Gets the value of the placeReservationWithPaymentTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSReservationWithPaymentTypeResponse }{@code >}
     *     
     */
    public JAXBElement<AFSReservationWithPaymentTypeResponse> getPlaceReservationWithPaymentTypeResult() {
        return placeReservationWithPaymentTypeResult;
    }

    /**
     * Sets the value of the placeReservationWithPaymentTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSReservationWithPaymentTypeResponse }{@code >}
     *     
     */
    public void setPlaceReservationWithPaymentTypeResult(JAXBElement<AFSReservationWithPaymentTypeResponse> value) {
        this.placeReservationWithPaymentTypeResult = value;
    }

}
