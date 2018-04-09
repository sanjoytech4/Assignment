package com.example.sanjoysaha.map.presenter

import android.content.Context
import android.util.Log
import com.sann.assignment.api.APIClient
import com.sann.assignment.api.APIService
import com.sann.assignment.presenter.MapCallback
import com.sann.assignment.presenter.MapPresenter
import com.sann.assignment.model.GetAppointmentDetails
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MapPresenterImplementation: MapPresenter {
    private val TAG = MapPresenterImplementation::class.java.simpleName
    private var context: Context? = null
    private var mapCallback: MapCallback? = null
    private fun constructor(){}


     constructor(context: Context, mapCallback: MapCallback) {
        this.context = context
        this.mapCallback = mapCallback
    }

    override fun fetchAppointDetails(){
        val retrofit = APIClient.getClient()
        val service = retrofit.create(APIService::class.java)
        var getAppointmentDetails=GetAppointmentDetails()
        getAppointmentDetails.CurrentDate="09/04/2018"
        getAppointmentDetails.SLUsername="ON"
        getAppointmentDetails.SLPassword="andriodtest"
        val call = service.GetAppointmentDetails(getAppointmentDetails)
        call.enqueue(object : Callback<com.sann.assignment.model.Response> {
            override fun onResponse(call: Call<com.sann.assignment.model.Response>, response: Response<com.sann.assignment.model.Response>?) {
                val data = response!!.body()
                Log.d(TAG,"fetchAppointDetails :: "+ data)
                Log.d(TAG,"fetchAppointDetails :: "+ data!!.apiName +data.responseDescription)

            }

            override fun onFailure(call: Call<com.sann.assignment.model.Response>, t: Throwable) {
                Log.i(TAG, "onFailure: " + t.message)
            }
        })
    }


}