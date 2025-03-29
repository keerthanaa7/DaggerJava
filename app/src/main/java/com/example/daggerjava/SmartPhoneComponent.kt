package com.example.daggerjava

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class, NCBBatteryModule::class])
interface SmartPhoneComponent {

   fun inject(mainActivity: MainActivity)

}