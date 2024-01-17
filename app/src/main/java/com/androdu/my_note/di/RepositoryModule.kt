package com.androdu.my_note.di

import com.androdu.my_note.data.local.repository.NoteRepositoryImpl
import com.androdu.my_note.domain.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun NoteRepository(
        noteRepositoryImpl: NoteRepositoryImpl
    ): NoteRepository
}