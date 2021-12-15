package com.cts.salesforcesdk

import android.app.Application
import com.salesforce.androidsdk.mobilesync.app.MobileSyncSDKManager

class App : Application(){

    override fun onCreate() {
        super.onCreate()

        MobileSyncSDKManager.initNative(applicationContext, MainActivity::class.java)
        MobileSyncSDKManager.getInstance().registerUsedAppFeature("KT")
    }
}