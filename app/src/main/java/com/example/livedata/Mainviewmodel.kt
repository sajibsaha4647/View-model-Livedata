package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData

class Mainviewmodel : ViewModel() {

    private var livedataObject = MutableLiveData<String>("this from mainview model")

    val livedata : LiveData<String> get() = livedataObject //this is publicly accessable

    fun updatedLivedata (){
        livedataObject.value = "muatable data change successfully"
    }

}