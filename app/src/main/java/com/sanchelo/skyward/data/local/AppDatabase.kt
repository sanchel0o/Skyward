package com.sanchelo.skyward.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sanchelo.skyward.data.local.dao.PlanetsDao
import com.sanchelo.skyward.data.local.entites.Planets

@Database(
    version = 1,
    entities = [
        Planets::class,
    ]
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getPlanetDao(): PlanetsDao
}
