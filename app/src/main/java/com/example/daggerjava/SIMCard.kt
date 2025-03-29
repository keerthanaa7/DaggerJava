package com.example.daggerjava

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(val serviceProvider: ServiceProvider){
    companion object{
        const val TAG = "SIMCard"
    }

    init {
        Log.d(TAG, "SIM card constructed")
    }

    fun getConnection() {
        serviceProvider.getConnection()
    }
}
