package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mainviewmodel:Mainviewmodel

    private val clickButton:Button get() = findViewById(R.id.clickid)
    private val changetext:TextView get() = findViewById(R.id.hellowid)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainviewmodel = ViewModelProvider(this).get(Mainviewmodel::class.java)

        mainviewmodel.livedata.observe(this, Observer{
            changetext.text = it
        })

        clickButton.setOnClickListener({
            mainviewmodel.updatedLivedata()
        })

    }
}