package com.kopylovis.kmmcomposemuliplatformexample.android

import android.app.Application
import com.kopylovis.kmmcomposemuliplatformexample.di.initKoin

class AndroidApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}