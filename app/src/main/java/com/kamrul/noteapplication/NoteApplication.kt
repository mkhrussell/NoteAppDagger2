package com.kamrul.noteapplication

import android.app.Application
import com.kamrul.noteapplication.di.DaggerNoteAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class NoteApplication: Application(), HasAndroidInjector {
    @Inject
    internal lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        initInjector()
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }

    private fun initInjector() {
        DaggerNoteAppComponent.factory()
            .create(this)
            .inject(this)
    }
}
