package com.sachin.livedataexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
     var counter=MutableLiveData<Int>()
     private var cnt=0;

    init {
        counter.value=0
    }

    fun setUpdatedCount() : Int{
        ++cnt
        return counter.value?.plus(cnt) ?: 0
    }
}