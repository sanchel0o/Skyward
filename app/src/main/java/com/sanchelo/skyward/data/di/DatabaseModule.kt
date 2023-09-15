package com.sanchelo.skyward.data.di

import android.content.Context
import androidx.room.Room
import com.sanchelo.skyward.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        name = "planets"
    ).createFromAsset("database/planets.db").build()

    @Singleton
    @Provides
    fun provideDao(database: AppDatabase) = database.getPlanetDao()

}
