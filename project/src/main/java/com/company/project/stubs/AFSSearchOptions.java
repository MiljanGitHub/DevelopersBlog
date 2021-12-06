//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.24 at 07:46:24 PM CET 
//


package com.company.project.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFSSearchOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFSSearchOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Horizon.ExternalServices.AFS}AFSOptionsBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatingUpdateType" type="{http://schemas.datacontract.org/2004/07/Horizon.AFS.General}AFSRatingUpdateType" minOccurs="0"/&gt;
 *         &lt;element name="SearchType" type="{http://schemas.datacontract.org/2004/07/Horizon.AFS.General}AFSSearchType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFSSearchOptions", namespace = "http://Horizon.ExternalServices.AFS", propOrder = {
    "ratingUpdateType",
    "searchType"
})
public class AFSSearchOptions
    extends AFSOptionsBase
{

    @XmlElement(name = "RatingUpdateType")
    @XmlSchemaType(name = "string")
    protected AFSRatingUpdateType ratingUpdateType;
    @XmlElement(name = "SearchType")
    @XmlSchemaType(name = "string")
    protected AFSSearchType searchType;

    /**
     * Gets the value of the ratingUpdateType property.
     * 
     * @return
     *     possible object is
     *     {@link AFSRatingUpdateType }
     *     
     */
    public AFSRatingUpdateType getRatingUpdateType() {
        return ratingUpdateType;
    }

    /**
     * Sets the value of the ratingUpdateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFSRatingUpdateType }
     *     
     */
    public void setRatingUpdateType(AFSRatingUpdateType value) {
        this.ratingUpdateType = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link AFSSearchType }
     *     
     */
    public AFSSearchType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFSSearchType }
     *     
     */
    public void setSearchType(AFSSearchType value) {
        this.searchType = value;
    }

}
