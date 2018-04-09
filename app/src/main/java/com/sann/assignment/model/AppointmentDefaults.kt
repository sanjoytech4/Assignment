package com.sann.assignment.model

class AppointmentDefaults {
    private var OutCardLeft: String? = null

    private var CloseVisitAllowed: String? = null

    private var Cancelled: String? = null

    private var CompletionStatusRequired: String? = null

    private var ConfirmedByUser: String? = null

    private var ConfirmedByUserDate: String? = null

    private var CustomerDetailsChecked: String? = null

    private var UnitDetailsChecked: String? = null

    private var AppointmentCompleted: String? = null

    private var WarrantyDetailsChecked: String? = null

    fun getOutCardLeft(): String? {
        return OutCardLeft
    }

    fun setOutCardLeft(OutCardLeft: String) {
        this.OutCardLeft = OutCardLeft
    }

    fun getCloseVisitAllowed(): String? {
        return CloseVisitAllowed
    }

    fun setCloseVisitAllowed(CloseVisitAllowed: String) {
        this.CloseVisitAllowed = CloseVisitAllowed
    }

    fun getCancelled(): String? {
        return Cancelled
    }

    fun setCancelled(Cancelled: String) {
        this.Cancelled = Cancelled
    }

    fun getCompletionStatusRequired(): String? {
        return CompletionStatusRequired
    }

    fun setCompletionStatusRequired(CompletionStatusRequired: String) {
        this.CompletionStatusRequired = CompletionStatusRequired
    }

    fun getConfirmedByUser(): String? {
        return ConfirmedByUser
    }

    fun setConfirmedByUser(ConfirmedByUser: String) {
        this.ConfirmedByUser = ConfirmedByUser
    }

    fun getConfirmedByUserDate(): String? {
        return ConfirmedByUserDate
    }

    fun setConfirmedByUserDate(ConfirmedByUserDate: String) {
        this.ConfirmedByUserDate = ConfirmedByUserDate
    }

    fun getCustomerDetailsChecked(): String? {
        return CustomerDetailsChecked
    }

    fun setCustomerDetailsChecked(CustomerDetailsChecked: String) {
        this.CustomerDetailsChecked = CustomerDetailsChecked
    }

    fun getUnitDetailsChecked(): String? {
        return UnitDetailsChecked
    }

    fun setUnitDetailsChecked(UnitDetailsChecked: String) {
        this.UnitDetailsChecked = UnitDetailsChecked
    }

    fun getAppointmentCompleted(): String? {
        return AppointmentCompleted
    }

    fun setAppointmentCompleted(AppointmentCompleted: String) {
        this.AppointmentCompleted = AppointmentCompleted
    }

    fun getWarrantyDetailsChecked(): String? {
        return WarrantyDetailsChecked
    }

    fun setWarrantyDetailsChecked(WarrantyDetailsChecked: String) {
        this.WarrantyDetailsChecked = WarrantyDetailsChecked
    }
}