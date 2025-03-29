package com.example.daggerjava

import android.util.Log
import javax.inject.Inject

interface Battery {
    companion object{
        const val TAG = "MemoryCard"
    }

    fun getPower():Int {
        return 50
    }
}
