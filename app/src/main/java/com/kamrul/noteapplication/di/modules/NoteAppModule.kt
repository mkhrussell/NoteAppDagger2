package com.kamrul.noteapplication.di.modules

import android.content.Context
import com.kamrul.noteapplication.NoteApplication
import com.kamrul.noteapplication.di.annotations.ApplicationContext
import dagger.Binds
import dagger.Module

@Module
abstract class NoteAppModule {
    @Binds
    @ApplicationContext
    abstract fun noteApplicationContext(application: NoteApplication): Context
}
