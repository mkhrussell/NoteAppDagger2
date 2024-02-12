package com.kamrul.noteapplication.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kamrul.noteapplication.di.annotations.ViewModelKey
import com.kamrul.noteapplication.viewmodel.NoteViewModel
import com.kamrul.noteapplication.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(NoteViewModel::class )
    abstract fun bindMainViewModel(noteViewModel: NoteViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
