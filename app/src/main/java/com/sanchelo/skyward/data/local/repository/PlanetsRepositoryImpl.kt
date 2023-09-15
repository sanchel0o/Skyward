package com.sanchelo.skyward.data.local.repository

import com.sanchelo.skyward.data.local.dao.PlanetsDao
import com.sanchelo.skyward.data.local.entites.Planets
import com.sanchelo.skyward.domain.repository.PlanetsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PlanetsRepositoryImpl @Inject constructor(
    private val planetsDao: PlanetsDao
): PlanetsRepository {
    override fun getPlanets(): Flow<List<Planets>> = flow {

    }

}