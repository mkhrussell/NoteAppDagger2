package com.kamrul.noteapplication.di.modules

import com.kamrul.noteapplication.di.annotations.ActivityScope
import com.kamrul.noteapplication.ui.AddEditNoteActivity
import com.kamrul.noteapplication.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [NoteAppModule::class, DataModule::class])
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bindAddEditNoteActivity(): AddEditNoteActivity
}
