package com.sann.assignment.model

class WarrantyDetails {
    private var ChargeType: String? = null

    private var FraudAlert: String? = null

    private var JobType: String? = null

    private var WarrantyNotes: String? = null

    private var PolicyNo: String? = null

    private var OriginalRetailer: String? = null

    private var Insurer: String? = null

    private var AuthorisationNumber: String? = null

    private var PolicyEndDate: String? = null

    fun getChargeType(): String? {
        return ChargeType
    }

    fun setChargeType(ChargeType: String) {
        this.ChargeType = ChargeType
    }

    fun getFraudAlert(): String? {
        return FraudAlert
    }

    fun setFraudAlert(FraudAlert: String) {
        this.FraudAlert = FraudAlert
    }

    fun getJobType(): String? {
        return JobType
    }

    fun setJobType(JobType: String) {
        this.JobType = JobType
    }

    fun getWarrantyNotes(): String? {
        return WarrantyNotes
    }

    fun setWarrantyNotes(WarrantyNotes: String) {
        this.WarrantyNotes = WarrantyNotes
    }

    fun getPolicyNo(): String? {
        return PolicyNo
    }

    fun setPolicyNo(PolicyNo: String) {
        this.PolicyNo = PolicyNo
    }

    fun getOriginalRetailer(): String? {
        return OriginalRetailer
    }

    fun setOriginalRetailer(OriginalRetailer: String) {
        this.OriginalRetailer = OriginalRetailer
    }

    fun getInsurer(): String? {
        return Insurer
    }

    fun setInsurer(Insurer: String) {
        this.Insurer = Insurer
    }

    fun getAuthorisationNumber(): String? {
        return AuthorisationNumber
    }

    fun setAuthorisationNumber(AuthorisationNumber: String) {
        this.AuthorisationNumber = AuthorisationNumber
    }

    fun getPolicyEndDate(): String? {
        return PolicyEndDate
    }

    fun setPolicyEndDate(PolicyEndDate: String) {
        this.PolicyEndDate = PolicyEndDate
    }

}