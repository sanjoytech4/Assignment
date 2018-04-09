package com.sann.assignment

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.sanjoysaha.map.presenter.MapPresenterImplementation
import com.sann.assignment.presenter.MapCallback
import com.sann.assignment.presenter.MapPresenter

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MapCallback {

    private var presenter: MapPresenter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        presenter= MapPresenterImplementation(this,this)
        presenter!!.fetchAppointDetails()
    }
}
