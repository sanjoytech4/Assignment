package com.sann.assignment.model

import org.simpleframework.xml.Root

@Root(name="Appointment")
class Appointment {
    private var CustomerDetails: CustomerDetails? = null
    private var ServiceHistory: ServiceHistory? = null
    private var SortOrder: String? = null
    private var ServiceProviderID: String? = null
    private var JobFaultCodes: String? = null
    private var WarrantyDetails: WarrantyDetails? = null
    private var AdditionalEngineerID: String? = null
    private var SLAppID: String? = null
    private var UnitDetails: UnitDetails? = null
    private var TimeSlot: String? = null
    private var JobDetails: JobDetails? = null
    private var PartsAttached: String? = null
    private var FaultReport: FaultReport? = null
    private var JobAttachments: JobAttachments? = null
    private var SendCustomerReceiptEmail: String? = null
    private var AppointmentType: String? = null
    private var AppointmentDefaults: AppointmentDefaults? = null
    private var ContactHistories: ContactHistories? = null

    fun getCustomerDetails(): CustomerDetails? {
        return CustomerDetails
    }

    fun setCustomerDetails(CustomerDetails: CustomerDetails) {
        this.CustomerDetails = CustomerDetails
    }

    fun getServiceHistory(): ServiceHistory? {
        return ServiceHistory
    }

    fun setServiceHistory(ServiceHistory: ServiceHistory) {
        this.ServiceHistory = ServiceHistory
    }

    fun getSortOrder(): String? {
        return SortOrder
    }

    fun setSortOrder(SortOrder: String) {
        this.SortOrder = SortOrder
    }

    fun getServiceProviderID(): String? {
        return ServiceProviderID
    }

    fun setServiceProviderID(ServiceProviderID: String) {
        this.ServiceProviderID = ServiceProviderID
    }

    fun getJobFaultCodes(): String? {
        return JobFaultCodes
    }

    fun setJobFaultCodes(JobFaultCodes: String) {
        this.JobFaultCodes = JobFaultCodes
    }

    fun getWarrantyDetails(): WarrantyDetails? {
        return WarrantyDetails
    }

    fun setWarrantyDetails(WarrantyDetails: WarrantyDetails) {
        this.WarrantyDetails = WarrantyDetails
    }

    fun getAdditionalEngineerID(): String? {
        return AdditionalEngineerID
    }

    fun setAdditionalEngineerID(AdditionalEngineerID: String) {
        this.AdditionalEngineerID = AdditionalEngineerID
    }

    fun getSLAppID(): String? {
        return SLAppID
    }

    fun setSLAppID(SLAppID: String) {
        this.SLAppID = SLAppID
    }

    fun getUnitDetails(): UnitDetails? {
        return UnitDetails
    }

    fun setUnitDetails(UnitDetails: UnitDetails) {
        this.UnitDetails = UnitDetails
    }

    fun getTimeSlot(): String? {
        return TimeSlot
    }

    fun setTimeSlot(TimeSlot: String) {
        this.TimeSlot = TimeSlot
    }

    fun getJobDetails(): JobDetails? {
        return JobDetails
    }

    fun setJobDetails(JobDetails: JobDetails) {
        this.JobDetails = JobDetails
    }

    fun getPartsAttached(): String? {
        return PartsAttached
    }

    fun setPartsAttached(PartsAttached: String) {
        this.PartsAttached = PartsAttached
    }

    fun getFaultReport(): FaultReport? {
        return FaultReport
    }

    fun setFaultReport(FaultReport: FaultReport) {
        this.FaultReport = FaultReport
    }

    fun getJobAttachments(): JobAttachments? {
        return JobAttachments
    }

    fun setJobAttachments(JobAttachments: JobAttachments) {
        this.JobAttachments = JobAttachments
    }

    fun getSendCustomerReceiptEmail(): String? {
        return SendCustomerReceiptEmail
    }

    fun setSendCustomerReceiptEmail(SendCustomerReceiptEmail: String) {
        this.SendCustomerReceiptEmail = SendCustomerReceiptEmail
    }

    fun getAppointmentType(): String? {
        return AppointmentType
    }

    fun setAppointmentType(AppointmentType: String) {
        this.AppointmentType = AppointmentType
    }

    fun getAppointmentDefaults(): AppointmentDefaults? {
        return AppointmentDefaults
    }

    fun setAppointmentDefaults(AppointmentDefaults: AppointmentDefaults) {
        this.AppointmentDefaults = AppointmentDefaults
    }

    fun getContactHistories(): ContactHistories? {
        return ContactHistories
    }

    fun setContactHistories(ContactHistories: ContactHistories) {
        this.ContactHistories = ContactHistories
    }
}