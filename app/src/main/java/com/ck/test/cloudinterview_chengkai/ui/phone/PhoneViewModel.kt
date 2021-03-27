package com.ck.test.cloudinterview_chengkai.ui.phone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PhoneViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "TODO: Phone Screen"
    }
    val text: LiveData<String> = _text
}