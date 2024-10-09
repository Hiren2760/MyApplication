package com.example.myapplication.ViewModel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {
    private var _username: String = ""
    private var _password: String = ""

    fun login(username: String,password:String) {
        _username = username
        _password = username
    }

    fun getUsername(): String = _username

    fun getPassword(): String = _password
}
