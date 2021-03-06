//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.24 at 07:46:24 PM CET 
//


package com.company.project.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFSInvoiceDistributionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AFSInvoiceDistributionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSet"/&gt;
 *     &lt;enumeration value="Paper"/&gt;
 *     &lt;enumeration value="EMail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AFSInvoiceDistributionType", namespace = "http://schemas.datacontract.org/2004/07/Horizon.AFS.General")
@XmlEnum
public enum AFSInvoiceDistributionType {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Paper")
    PAPER("Paper"),
    @XmlEnumValue("EMail")
    E_MAIL("EMail");
    private final String value;

    AFSInvoiceDistributionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AFSInvoiceDistributionType fromValue(String v) {
        for (AFSInvoiceDistributionType c: AFSInvoiceDistributionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
