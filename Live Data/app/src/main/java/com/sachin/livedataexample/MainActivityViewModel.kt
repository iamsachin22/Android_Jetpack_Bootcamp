package com.sachin.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
     private var counter=MutableLiveData<Int>()
     val counterData : LiveData<Int>
     get() = counter

    init {
        counter.value=0
    }

    fun setUpdatedCount(){
        counter.value=(counter.value)?.plus(1)
    }
}