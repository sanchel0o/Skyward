package com.sanchelo.skyward.domain.di

import com.sanchelo.skyward.data.local.repository.PlanetsRepositoryImpl
import com.sanchelo.skyward.domain.repository.PlanetsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun providePlanetsRepository(impl: PlanetsRepositoryImpl): PlanetsRepository
}