package com.sanchelo.skyward.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.sanchelo.skyward.data.local.entites.Planets
import kotlinx.coroutines.flow.Flow

@Dao
interface PlanetsDao {

    @Query("SELECT * FROM planets")
    fun getAllPlanets(): Flow<List<Planets>>

}
