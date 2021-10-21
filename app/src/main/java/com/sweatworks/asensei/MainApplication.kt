package com.sweatworks.asensei
import android.app.Application
import ai.asensei.sdk.AsenseiSdkManager
class MainApplication : Application() {
    override fun onCreate(): Unit {
        super.onCreate()
        AsenseiSdkManager.initialize()
    }
}