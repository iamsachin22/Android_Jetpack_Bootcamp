package com.sachin.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
     private var counter=MutableLiveData<Int>()

     val counterData : LiveData<Int>
     get() = counter

     private var cnt=0;

    init {
        counter.value=0
    }

    fun setUpdatedCount() : Int{
        ++cnt
        return counter.value?.plus(cnt) ?: 0
    }
}