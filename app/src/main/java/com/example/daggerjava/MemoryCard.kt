package com.example.daggerjava

import android.util.Log
import com.example.daggerjava.SIMCard.Companion
import javax.inject.Inject

class MemoryCard() {

    companion object{
        const val TAG = "MemoryCard"
    }

    init {
        Log.d(SIMCard.TAG, "Memory card constructed")
    }

    fun getSpaceAvailability() {
        Log.d(SIMCard.TAG, "Memory space available")
    }
}
