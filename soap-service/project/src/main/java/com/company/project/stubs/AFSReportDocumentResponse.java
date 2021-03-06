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
 * <p>Java class for AFSReportDocumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFSReportDocumentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Horizon.ExternalServices.AFS}AFSResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportDocument" type="{http://Horizon.ExternalServices.AFS}AFSReportDocument" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFSReportDocumentResponse", namespace = "http://Horizon.ExternalServices.AFS", propOrder = {
    "reportDocument"
})
public class AFSReportDocumentResponse
    extends AFSResponseBase
{

    @XmlElementRef(name = "ReportDocument", namespace = "http://Horizon.ExternalServices.AFS", type = JAXBElement.class, required = false)
    protected JAXBElement<AFSReportDocument> reportDocument;

    /**
     * Gets the value of the reportDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFSReportDocument }{@code >}
     *     
     */
    public JAXBElement<AFSReportDocument> getReportDocument() {
        return reportDocument;
    }

    /**
     * Sets the value of the reportDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFSReportDocument }{@code >}
     *     
     */
    public void setReportDocument(JAXBElement<AFSReportDocument> value) {
        this.reportDocument = value;
    }

}
