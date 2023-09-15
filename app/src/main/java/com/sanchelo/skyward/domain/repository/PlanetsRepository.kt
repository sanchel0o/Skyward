package com.sanchelo.skyward.domain.repository

import com.sanchelo.skyward.data.local.entites.Planets
import kotlinx.coroutines.flow.Flow

interface PlanetsRepository {
    fun getPlanets(): Flow<List<Planets>>
}