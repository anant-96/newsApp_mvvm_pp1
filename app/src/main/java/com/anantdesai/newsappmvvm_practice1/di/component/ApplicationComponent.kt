package com.anantdesai.newsappmvvm_practice1.di.component

import com.anantdesai.newsappmvvm_practice1.NewsApplication
import com.anantdesai.newsappmvvm_practice1.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: NewsApplication)
}
