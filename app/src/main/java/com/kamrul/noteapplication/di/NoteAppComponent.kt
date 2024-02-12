package com.kamrul.noteapplication.di

import com.kamrul.noteapplication.NoteApplication
import com.kamrul.noteapplication.di.annotations.ApplicationScope
import com.kamrul.noteapplication.di.modules.ActivityModule
import com.kamrul.noteapplication.di.modules.DataModule
import com.kamrul.noteapplication.di.modules.NoteAppModule
import com.kamrul.noteapplication.di.modules.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    ViewModelModule::class,
    DataModule::class,
    NoteAppModule::class,
    AndroidSupportInjectionModule::class,
    AndroidInjectionModule::class,
    ActivityModule::class
])
@ApplicationScope
interface NoteAppComponent: AndroidInjector<NoteApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: NoteApplication): NoteAppComponent
    }
}
