package com.sann.assignment.model

class FaultReport {
    private var FaultDescription: String? = null

    private var FaultHistories: String? = null

    fun getFaultDescription(): String? {
        return FaultDescription
    }

    fun setFaultDescription(FaultDescription: String) {
        this.FaultDescription = FaultDescription
    }

    fun getFaultHistories(): String? {
        return FaultHistories
    }

    fun setFaultHistories(FaultHistories: String) {
        this.FaultHistories = FaultHistories
    }

}