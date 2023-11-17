package com.but.ocpp.model.ocpp.s2d;

import cn.hutool.core.date.DateTime;

/**
 * @Author jun.sun
 * @ClassName ChargingProfile
 * @Description TODO
 * @Date 2023/11/17 10:38
 * @Version 1.0
 */
public class ChargingProfile {
    protected int chargingProfileId;
    protected Integer transactionId;
    protected int stackLevel;

    protected ChargingProfilePurposeType chargingProfilePurpose;

    protected ChargingProfileKindType chargingProfileKind;
    protected RecurrencyKindType recurrencyKind;

    protected DateTime validFrom;

    protected DateTime validTo;
    protected ChargingSchedule chargingSchedule;

    /**
     * Gets the value of the chargingProfileId property.
     *
     */
    public int getChargingProfileId() {
        return chargingProfileId;
    }

    /**
     * Sets the value of the chargingProfileId property.
     *
     */
    public void setChargingProfileId(int value) {
        this.chargingProfileId = value;
    }

    public boolean isSetChargingProfileId() {
        return true;
    }

    /**
     * Gets the value of the transactionId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTransactionId(Integer value) {
        this.transactionId = value;
    }

    public boolean isSetTransactionId() {
        return (this.transactionId!= null);
    }

    /**
     * Gets the value of the stackLevel property.
     *
     */
    public int getStackLevel() {
        return stackLevel;
    }

    /**
     * Sets the value of the stackLevel property.
     *
     */
    public void setStackLevel(int value) {
        this.stackLevel = value;
    }

    public boolean isSetStackLevel() {
        return true;
    }

    /**
     * Gets the value of the chargingProfilePurpose property.
     *
     * @return
     *     possible object is
     *     {@link ChargingProfilePurposeType }
     *
     */
    public ChargingProfilePurposeType getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }

    /**
     * Sets the value of the chargingProfilePurpose property.
     *
     * @param value
     *     allowed object is
     *     {@link ChargingProfilePurposeType }
     *
     */
    public void setChargingProfilePurpose(ChargingProfilePurposeType value) {
        this.chargingProfilePurpose = value;
    }

    public boolean isSetChargingProfilePurpose() {
        return (this.chargingProfilePurpose!= null);
    }

    /**
     * Gets the value of the chargingProfileKind property.
     *
     * @return
     *     possible object is
     *     {@link ChargingProfileKindType }
     *
     */
    public ChargingProfileKindType getChargingProfileKind() {
        return chargingProfileKind;
    }

    /**
     * Sets the value of the chargingProfileKind property.
     *
     * @param value
     *     allowed object is
     *     {@link ChargingProfileKindType }
     *
     */
    public void setChargingProfileKind(ChargingProfileKindType value) {
        this.chargingProfileKind = value;
    }

    public boolean isSetChargingProfileKind() {
        return (this.chargingProfileKind!= null);
    }

    /**
     * Gets the value of the recurrencyKind property.
     *
     * @return
     *     possible object is
     *     {@link RecurrencyKindType }
     *
     */
    public RecurrencyKindType getRecurrencyKind() {
        return recurrencyKind;
    }

    /**
     * Sets the value of the recurrencyKind property.
     *
     * @param value
     *     allowed object is
     *     {@link RecurrencyKindType }
     *
     */
    public void setRecurrencyKind(RecurrencyKindType value) {
        this.recurrencyKind = value;
    }

    public boolean isSetRecurrencyKind() {
        return (this.recurrencyKind!= null);
    }

    /**
     * Gets the value of the validFrom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public DateTime getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValidFrom(DateTime value) {
        this.validFrom = value;
    }

    public boolean isSetValidFrom() {
        return (this.validFrom!= null);
    }

    /**
     * Gets the value of the validTo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public DateTime getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValidTo(DateTime value) {
        this.validTo = value;
    }

    public boolean isSetValidTo() {
        return (this.validTo!= null);
    }

    /**
     * Gets the value of the chargingSchedule property.
     *
     * @return
     *     possible object is
     *     {@link ChargingSchedule }
     *
     */
    public ChargingSchedule getChargingSchedule() {
        return chargingSchedule;
    }

    /**
     * Sets the value of the chargingSchedule property.
     *
     * @param value
     *     allowed object is
     *     {@link ChargingSchedule }
     *
     */
    public void setChargingSchedule(ChargingSchedule value) {
        this.chargingSchedule = value;
    }

    public boolean isSetChargingSchedule() {
        return (this.chargingSchedule!= null);
    }

    public ChargingProfile withChargingProfileId(int value) {
        setChargingProfileId(value);
        return this;
    }

    public ChargingProfile withTransactionId(Integer value) {
        setTransactionId(value);
        return this;
    }

    public ChargingProfile withStackLevel(int value) {
        setStackLevel(value);
        return this;
    }

    public ChargingProfile withChargingProfilePurpose(ChargingProfilePurposeType value) {
        setChargingProfilePurpose(value);
        return this;
    }

    public ChargingProfile withChargingProfileKind(ChargingProfileKindType value) {
        setChargingProfileKind(value);
        return this;
    }

    public ChargingProfile withRecurrencyKind(RecurrencyKindType value) {
        setRecurrencyKind(value);
        return this;
    }

    public ChargingProfile withValidFrom(DateTime value) {
        setValidFrom(value);
        return this;
    }

    public ChargingProfile withValidTo(DateTime value) {
        setValidTo(value);
        return this;
    }

    public ChargingProfile withChargingSchedule(ChargingSchedule value) {
        setChargingSchedule(value);
        return this;
    }
}
