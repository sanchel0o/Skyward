package com.sanchelo.skyward.domain.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import java.util.UUID

data class PlanetData(
    val planetId: UUID,
    val planetName: String?,
    val planetImage: String?,
    val inDepth: String?,
    val overview: String?,
    val explorer: UUID, // ref to explorer id
    val moons: UUID     // ref to moons id'es
    //numbers
)