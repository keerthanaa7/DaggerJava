package com.example.daggerjava

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Smartphone @Inject constructor(val battery: Battery, val simCard: SIMCard, val memoryCard: MemoryCard){

    init {
        Log.i(TAG, "SMART phone constructed")
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()

    }

    fun makeacall(){
        Log.i(TAG, "calling")
    }

    companion object {
        private const val TAG = "SmartPhone"
    }
}
