package com.kamrul.noteapplication.di.modules

import android.content.Context
import com.kamrul.noteapplication.data.NoteDatabase
import com.kamrul.noteapplication.data.NoteRepository
import com.kamrul.noteapplication.di.annotations.ApplicationContext
import dagger.Module
import dagger.Provides

@Module(includes = [NoteAppModule::class])
class DataModule {
    @Provides
    fun provideNoteRepository(@ApplicationContext context: Context): NoteRepository {
        return NoteRepository(NoteDatabase.getDatabase(context).getNotesDao())
    }
}
