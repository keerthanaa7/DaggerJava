package com.example.daggerjava

import dagger.Module
import dagger.Provides


@Module
class NCBBatteryModule {

    @Provides
    fun providesNCBBattery(nickelCadmiumBattery: NickelCadmiumBattery):Battery{
        return nickelCadmiumBattery
    }
}