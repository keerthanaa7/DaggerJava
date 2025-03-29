package com.example.daggerjava

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule (val memoryCardsize:Int) {

    companion object{
        const val TAG = "MemoryCardModule"
    }

    @Provides
    fun providesMemoryCard():MemoryCard{
        Log.i(TAG, "memory card size is $memoryCardsize")
        return MemoryCard()
    }
}