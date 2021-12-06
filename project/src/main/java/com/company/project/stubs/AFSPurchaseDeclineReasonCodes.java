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
 * <p>Java class for AFSPurchaseDeclineReasonCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AFSPurchaseDeclineReasonCodes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSet"/&gt;
 *     &lt;enumeration value="MaxCustomerLimitReached"/&gt;
 *     &lt;enumeration value="MaxClientLimitReached"/&gt;
 *     &lt;enumeration value="RequestedAmountOverAmountLimit"/&gt;
 *     &lt;enumeration value="InvoiceDateDueDateBeforeValidInterval"/&gt;
 *     &lt;enumeration value="InvoiceDateDueDateAfterValidInterval"/&gt;
 *     &lt;enumeration value="TooLowRating"/&gt;
 *     &lt;enumeration value="CustomerHaveInvoiceswithPurchaseStop"/&gt;
 *     &lt;enumeration value="PurchaseManualStoppedForCustomer"/&gt;
 *     &lt;enumeration value="MaxLoanReached"/&gt;
 *     &lt;enumeration value="MaxLoanPerCustomerReached"/&gt;
 *     &lt;enumeration value="MaxLoanPerInvoiceReached"/&gt;
 *     &lt;enumeration value="MissingRating"/&gt;
 *     &lt;enumeration value="MaxCustomerRelationShipLimitReached"/&gt;
 *     &lt;enumeration value="AmountBelowMinPurchaseLimit"/&gt;
 *     &lt;enumeration value="CompanyBankrupt"/&gt;
 *     &lt;enumeration value="PurchaseStopSetOnClient"/&gt;
 *     &lt;enumeration value="PurchaseStopSetOnInvoice"/&gt;
 *     &lt;enumeration value="CustomerHaveNegativeBalance"/&gt;
 *     &lt;enumeration value="CustomerLimitForClientReached"/&gt;
 *     &lt;enumeration value="InsuredAmountLimitForCustomerReached"/&gt;
 *     &lt;enumeration value="ClientLimitPaymentContractsReached"/&gt;
 *     &lt;enumeration value="MaxTotalCustomerRelationShipLimitReached"/&gt;
 *     &lt;enumeration value="ClientNotConfiguredForPurchase"/&gt;
 *     &lt;enumeration value="CustomerAgeBelowMinAgeForPurchase"/&gt;
 *     &lt;enumeration value="CustomerHaveAgedInvoices"/&gt;
 *     &lt;enumeration value="PurchaseStoppedForCustomerRelationShip"/&gt;
 *     &lt;enumeration value="MissingPurchasePercent"/&gt;
 *     &lt;enumeration value="MissingPurchaseConfiguration"/&gt;
 *     &lt;enumeration value="CustomerHaveAgedCustomerAccounts"/&gt;
 *     &lt;enumeration value="NumDaysToDueDateNotWithinDefinedRange"/&gt;
 *     &lt;enumeration value="CustomerLimitGlobalReached"/&gt;
 *     &lt;enumeration value="CustomerRatingFailed"/&gt;
 *     &lt;enumeration value="InvoiceDateBeforeValidInterval"/&gt;
 *     &lt;enumeration value="InvoiceDateAfterValidInterval"/&gt;
 *     &lt;enumeration value="DueDateBeforeValidInterval"/&gt;
 *     &lt;enumeration value="DueDateAfterValidInterval"/&gt;
 *     &lt;enumeration value="TrafficLightNotApproved"/&gt;
 *     &lt;enumeration value="CustomerHasDebtCollOnGlobal"/&gt;
 *     &lt;enumeration value="Reminder_DCStopOnCustomer"/&gt;
 *     &lt;enumeration value="Reminder_DCStopOnInvoice"/&gt;
 *     &lt;enumeration value="MissingReservation"/&gt;
 *     &lt;enumeration value="TooLowReservation"/&gt;
 *     &lt;enumeration value="ReservationExpired"/&gt;
 *     &lt;enumeration value="IsBlacklisted"/&gt;
 *     &lt;enumeration value="AFSValidationError"/&gt;
 *     &lt;enumeration value="CreditAgreementPendingForSigning"/&gt;
 *     &lt;enumeration value="PurchaseStoppedForAccount"/&gt;
 *     &lt;enumeration value="AccountRemainingLimitReached"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AFSPurchaseDeclineReasonCodes", namespace = "http://schemas.datacontract.org/2004/07/Horizon.AFS.General")
@XmlEnum
public enum AFSPurchaseDeclineReasonCodes {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("MaxCustomerLimitReached")
    MAX_CUSTOMER_LIMIT_REACHED("MaxCustomerLimitReached"),
    @XmlEnumValue("MaxClientLimitReached")
    MAX_CLIENT_LIMIT_REACHED("MaxClientLimitReached"),
    @XmlEnumValue("RequestedAmountOverAmountLimit")
    REQUESTED_AMOUNT_OVER_AMOUNT_LIMIT("RequestedAmountOverAmountLimit"),
    @XmlEnumValue("InvoiceDateDueDateBeforeValidInterval")
    INVOICE_DATE_DUE_DATE_BEFORE_VALID_INTERVAL("InvoiceDateDueDateBeforeValidInterval"),
    @XmlEnumValue("InvoiceDateDueDateAfterValidInterval")
    INVOICE_DATE_DUE_DATE_AFTER_VALID_INTERVAL("InvoiceDateDueDateAfterValidInterval"),
    @XmlEnumValue("TooLowRating")
    TOO_LOW_RATING("TooLowRating"),
    @XmlEnumValue("CustomerHaveInvoiceswithPurchaseStop")
    CUSTOMER_HAVE_INVOICESWITH_PURCHASE_STOP("CustomerHaveInvoiceswithPurchaseStop"),
    @XmlEnumValue("PurchaseManualStoppedForCustomer")
    PURCHASE_MANUAL_STOPPED_FOR_CUSTOMER("PurchaseManualStoppedForCustomer"),
    @XmlEnumValue("MaxLoanReached")
    MAX_LOAN_REACHED("MaxLoanReached"),
    @XmlEnumValue("MaxLoanPerCustomerReached")
    MAX_LOAN_PER_CUSTOMER_REACHED("MaxLoanPerCustomerReached"),
    @XmlEnumValue("MaxLoanPerInvoiceReached")
    MAX_LOAN_PER_INVOICE_REACHED("MaxLoanPerInvoiceReached"),
    @XmlEnumValue("MissingRating")
    MISSING_RATING("MissingRating"),
    @XmlEnumValue("MaxCustomerRelationShipLimitReached")
    MAX_CUSTOMER_RELATION_SHIP_LIMIT_REACHED("MaxCustomerRelationShipLimitReached"),
    @XmlEnumValue("AmountBelowMinPurchaseLimit")
    AMOUNT_BELOW_MIN_PURCHASE_LIMIT("AmountBelowMinPurchaseLimit"),
    @XmlEnumValue("CompanyBankrupt")
    COMPANY_BANKRUPT("CompanyBankrupt"),
    @XmlEnumValue("PurchaseStopSetOnClient")
    PURCHASE_STOP_SET_ON_CLIENT("PurchaseStopSetOnClient"),
    @XmlEnumValue("PurchaseStopSetOnInvoice")
    PURCHASE_STOP_SET_ON_INVOICE("PurchaseStopSetOnInvoice"),
    @XmlEnumValue("CustomerHaveNegativeBalance")
    CUSTOMER_HAVE_NEGATIVE_BALANCE("CustomerHaveNegativeBalance"),
    @XmlEnumValue("CustomerLimitForClientReached")
    CUSTOMER_LIMIT_FOR_CLIENT_REACHED("CustomerLimitForClientReached"),
    @XmlEnumValue("InsuredAmountLimitForCustomerReached")
    INSURED_AMOUNT_LIMIT_FOR_CUSTOMER_REACHED("InsuredAmountLimitForCustomerReached"),
    @XmlEnumValue("ClientLimitPaymentContractsReached")
    CLIENT_LIMIT_PAYMENT_CONTRACTS_REACHED("ClientLimitPaymentContractsReached"),
    @XmlEnumValue("MaxTotalCustomerRelationShipLimitReached")
    MAX_TOTAL_CUSTOMER_RELATION_SHIP_LIMIT_REACHED("MaxTotalCustomerRelationShipLimitReached"),
    @XmlEnumValue("ClientNotConfiguredForPurchase")
    CLIENT_NOT_CONFIGURED_FOR_PURCHASE("ClientNotConfiguredForPurchase"),
    @XmlEnumValue("CustomerAgeBelowMinAgeForPurchase")
    CUSTOMER_AGE_BELOW_MIN_AGE_FOR_PURCHASE("CustomerAgeBelowMinAgeForPurchase"),
    @XmlEnumValue("CustomerHaveAgedInvoices")
    CUSTOMER_HAVE_AGED_INVOICES("CustomerHaveAgedInvoices"),
    @XmlEnumValue("PurchaseStoppedForCustomerRelationShip")
    PURCHASE_STOPPED_FOR_CUSTOMER_RELATION_SHIP("PurchaseStoppedForCustomerRelationShip"),
    @XmlEnumValue("MissingPurchasePercent")
    MISSING_PURCHASE_PERCENT("MissingPurchasePercent"),
    @XmlEnumValue("MissingPurchaseConfiguration")
    MISSING_PURCHASE_CONFIGURATION("MissingPurchaseConfiguration"),
    @XmlEnumValue("CustomerHaveAgedCustomerAccounts")
    CUSTOMER_HAVE_AGED_CUSTOMER_ACCOUNTS("CustomerHaveAgedCustomerAccounts"),
    @XmlEnumValue("NumDaysToDueDateNotWithinDefinedRange")
    NUM_DAYS_TO_DUE_DATE_NOT_WITHIN_DEFINED_RANGE("NumDaysToDueDateNotWithinDefinedRange"),
    @XmlEnumValue("CustomerLimitGlobalReached")
    CUSTOMER_LIMIT_GLOBAL_REACHED("CustomerLimitGlobalReached"),
    @XmlEnumValue("CustomerRatingFailed")
    CUSTOMER_RATING_FAILED("CustomerRatingFailed"),
    @XmlEnumValue("InvoiceDateBeforeValidInterval")
    INVOICE_DATE_BEFORE_VALID_INTERVAL("InvoiceDateBeforeValidInterval"),
    @XmlEnumValue("InvoiceDateAfterValidInterval")
    INVOICE_DATE_AFTER_VALID_INTERVAL("InvoiceDateAfterValidInterval"),
    @XmlEnumValue("DueDateBeforeValidInterval")
    DUE_DATE_BEFORE_VALID_INTERVAL("DueDateBeforeValidInterval"),
    @XmlEnumValue("DueDateAfterValidInterval")
    DUE_DATE_AFTER_VALID_INTERVAL("DueDateAfterValidInterval"),
    @XmlEnumValue("TrafficLightNotApproved")
    TRAFFIC_LIGHT_NOT_APPROVED("TrafficLightNotApproved"),
    @XmlEnumValue("CustomerHasDebtCollOnGlobal")
    CUSTOMER_HAS_DEBT_COLL_ON_GLOBAL("CustomerHasDebtCollOnGlobal"),
    @XmlEnumValue("Reminder_DCStopOnCustomer")
    REMINDER_DC_STOP_ON_CUSTOMER("Reminder_DCStopOnCustomer"),
    @XmlEnumValue("Reminder_DCStopOnInvoice")
    REMINDER_DC_STOP_ON_INVOICE("Reminder_DCStopOnInvoice"),
    @XmlEnumValue("MissingReservation")
    MISSING_RESERVATION("MissingReservation"),
    @XmlEnumValue("TooLowReservation")
    TOO_LOW_RESERVATION("TooLowReservation"),
    @XmlEnumValue("ReservationExpired")
    RESERVATION_EXPIRED("ReservationExpired"),
    @XmlEnumValue("IsBlacklisted")
    IS_BLACKLISTED("IsBlacklisted"),
    @XmlEnumValue("AFSValidationError")
    AFS_VALIDATION_ERROR("AFSValidationError"),
    @XmlEnumValue("CreditAgreementPendingForSigning")
    CREDIT_AGREEMENT_PENDING_FOR_SIGNING("CreditAgreementPendingForSigning"),
    @XmlEnumValue("PurchaseStoppedForAccount")
    PURCHASE_STOPPED_FOR_ACCOUNT("PurchaseStoppedForAccount"),
    @XmlEnumValue("AccountRemainingLimitReached")
    ACCOUNT_REMAINING_LIMIT_REACHED("AccountRemainingLimitReached");
    private final String value;

    AFSPurchaseDeclineReasonCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AFSPurchaseDeclineReasonCodes fromValue(String v) {
        for (AFSPurchaseDeclineReasonCodes c: AFSPurchaseDeclineReasonCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
