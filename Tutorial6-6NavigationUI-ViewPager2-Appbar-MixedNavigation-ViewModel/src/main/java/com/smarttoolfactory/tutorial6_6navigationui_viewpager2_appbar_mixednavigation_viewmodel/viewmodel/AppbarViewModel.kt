package com.smarttoolfactory.tutorial6_6navigationui_viewpager2_appbar_mixednavigation_viewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class AppbarViewModel : ViewModel() {
    val currentNavController = MutableLiveData<NavController?>()

    var theEvent = MutableLiveData<Unit>()

//    // Kind of a getter but casted as LiveData to prevent updates from outsite viewmodel
    fun getEvent(): LiveData<Unit> {
        return theEvent
    }

    // Trigger the event update
    fun triggerEvent() {
        theEvent.postValue(Unit)
    }
}