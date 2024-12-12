package com.anantdesai.newsappmvvm_practice1

import android.app.Application
import com.anantdesai.newsappmvvm_practice1.di.component.ApplicationComponent
import com.anantdesai.newsappmvvm_practice1.di.component.DaggerApplicationComponent
import com.anantdesai.newsappmvvm_practice1.di.module.ApplicationModule

class NewsApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}
