package com.sann.assignment.model

class ContactHistories {
    private var ContactHistory: Array<ContactHistory>? = null

    fun getContactHistory(): Array<ContactHistory>? {
        return ContactHistory
    }

    fun setContactHistory(ContactHistory: Array<ContactHistory>) {
        this.ContactHistory = ContactHistory
    }
}