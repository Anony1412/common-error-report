package com.sun.commonerrorexample.example1.fragment_a

import androidx.lifecycle.MutableLiveData
import com.sun.commonerrorexample.base.BaseViewModel

class AViewModel: BaseViewModel() {
    val test = MutableLiveData<String>().apply {
        value = ""
    }
}
