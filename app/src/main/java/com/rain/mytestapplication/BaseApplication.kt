package com.rain.mytestapplication

import android.app.Application
import android.content.Context
import android.content.res.Configuration

class BaseApplication : Application() {


    init {
    }

    override fun onCreate() {
        super.onCreate()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    override fun createConfigurationContext(overrideConfiguration: Configuration): Context {
        return super.createConfigurationContext(overrideConfiguration)
    }
}