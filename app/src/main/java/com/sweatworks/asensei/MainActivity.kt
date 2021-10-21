package com.sweatworks.asensei

import ai.asensei.sdk.AsenseiSdkManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.ionic.portals.PortalFragment
import io.ionic.portals.PortalView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (AsenseiSdkManager.listenersReady) {
            System.out.println("ready")
        }
    }
}