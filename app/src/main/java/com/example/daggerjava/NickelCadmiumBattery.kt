package com.example.daggerjava

import android.util.Log
import javax.inject.Inject

class NickelCadmiumBattery @Inject constructor():Battery {

    override fun getPower(): Int {
      Log.i(TAG, "power from nickel cadmium")
        return 10
    }
    companion object{
        const val TAG = "NickelCadmiumBattery"
    }


}