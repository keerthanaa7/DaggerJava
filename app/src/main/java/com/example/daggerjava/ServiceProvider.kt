package com.example.daggerjava

import android.util.Log
import com.example.daggerjava.SIMCard.Companion
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    companion object{
        const val TAG = "ServiceProvider"
    }

    init {
        Log.d(SIMCard.TAG, "ServiceProvider constructed")
    }

    fun getConnection():String{
        return "T-MOBILE"
    }
}
