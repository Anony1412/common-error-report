package com.sun.commonerrorexample.example2.fragment_c

import androidx.lifecycle.MutableLiveData
import com.sun.commonerrorexample.base.BaseViewModel

class CViewModel : BaseViewModel() {

    val count = MutableLiveData<Int>().apply { value = 0 }

    fun plusNumber() {
        count.value = count.value?.plus(1)
    }
}
