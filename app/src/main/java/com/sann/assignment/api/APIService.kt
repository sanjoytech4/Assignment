package com.sann.assignment.api


import com.sann.assignment.model.GetAppointmentDetails
import com.sann.assignment.model.Response
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST


interface APIService {
    companion object {
        val BASE_URL:String = "https://www.skylinecms.co.uk/alpha/RemoteEngineerAPI/"
    }

    @Headers("Content-Type: application/xml", "Accept: application/xml")
    @POST("GetAppointmentDetails")
    fun GetAppointmentDetails(@Body getAppointmentDetails: GetAppointmentDetails): Call<Response>
}