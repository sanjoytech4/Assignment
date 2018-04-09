package com.sann.assignment.model

class ServiceHistory {
    private var DescriptionOfRepair: String? = null

    fun getDescriptionOfRepair(): String? {
        return DescriptionOfRepair
    }

    fun setDescriptionOfRepair(DescriptionOfRepair: String) {
        this.DescriptionOfRepair = DescriptionOfRepair
    }

}