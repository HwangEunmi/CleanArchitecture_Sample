package com.kakaovx.practice.cleanarchitecturepractice

import android.app.Application
import com.kakaovx.practice.cleanarchitecturepractice.core.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }

    private fun initializeKoin() {
        startKoin {
            androidContext(this@App)
            loadKoinModules(appModules)
        }
    }
}