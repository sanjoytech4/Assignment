package com.sann.assignment.model

class ContactHistory {
    private var User: String? = null

    private var Notes: String? = null

    private var Time: String? = null

    private var Action: String? = null

    private var Date: String? = null

    private var AppointmentID: String? = null

    fun getUser(): String? {
        return User
    }

    fun setUser(User: String) {
        this.User = User
    }

    fun getNotes(): String? {
        return Notes
    }

    fun setNotes(Notes: String) {
        this.Notes = Notes
    }

    fun getTime(): String? {
        return Time
    }

    fun setTime(Time: String) {
        this.Time = Time
    }

    fun getAction(): String? {
        return Action
    }

    fun setAction(Action: String) {
        this.Action = Action
    }

    fun getDate(): String? {
        return Date
    }

    fun setDate(Date: String) {
        this.Date = Date
    }

    fun getAppointmentID(): String? {
        return AppointmentID
    }

    fun setAppointmentID(AppointmentID: String) {
        this.AppointmentID = AppointmentID
    }
}