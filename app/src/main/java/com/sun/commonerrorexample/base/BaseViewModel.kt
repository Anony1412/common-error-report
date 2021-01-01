package com.sun.commonerrorexample.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel: ViewModel() {
    val errorMessage = MutableLiveData<String>().apply { value = "" }
}
