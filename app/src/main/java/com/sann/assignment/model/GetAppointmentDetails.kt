package com.sann.assignment.model

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name="GetAppointmentDetails")
class GetAppointmentDetails {

    var SLUsername:String?=null
        @Element
        get
        @Element
        set
    var SLPassword:String?=null
        @Element
        get
        @Element
        set

    var CurrentDate:String?=null
        @Element(name = "CurrentDate")
        get
        @Element(name = "CurrentDate")
        set

    constructor(){

    }
}