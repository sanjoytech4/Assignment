package com.sann.assignment.model

import com.google.gson.annotations.SerializedName
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name="Response")
class Response {

    var apiName:String?=null
        @Element(name = "APIName")
        get
        @Element(name = "APIName")
        set

    var responseCode:String?=null
        @Element(name = "ResponseCode")
        get
        @Element(name = "ResponseCode")
        set

    var responseDescription:String?=null
        @Element(name = "ResponseDescription")
        get
        @Element(name = "ResponseDescription")
        set

    var appointments: Array<Appointment>? = null
        @Element(name = "Appointments")
        get
        @Element(name = "Appointments")
        set




}