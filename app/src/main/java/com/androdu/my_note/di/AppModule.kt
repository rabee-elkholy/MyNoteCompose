package com.androdu.my_note.di

import android.content.Context
import androidx.room.Room
import com.androdu.my_note.data.local.room.dao.MyNoteDatabase
import com.androdu.my_note.data.local.room.dao.NoteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideBananaDatabase(context: Context): NoteDao {
        return Room.databaseBuilder(
            context,
            MyNoteDatabase::class.java,
            "MyNote.db"
        ).build().dao
    }

    @Provides
    @Singleton
    fun provideApplicationContext(@ApplicationContext context: Context): Context {
        return context
    }
}