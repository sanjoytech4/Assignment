package com.sann.assignment.model

class ServiceTypeIDs {
    private var ServiceTypeID: Array<String>? = null

    fun getServiceTypeID(): Array<String>? {
        return ServiceTypeID
    }

    fun setServiceTypeID(ServiceTypeID: Array<String>) {
        this.ServiceTypeID = ServiceTypeID
    }
}