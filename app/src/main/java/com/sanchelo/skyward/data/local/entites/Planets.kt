package com.sanchelo.skyward.data.local.entites

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sanchelo.skyward.data.local.model.PlanetsModel
import java.util.UUID

@Entity(
    tableName = "planets"
)
data class Planets(
    @PrimaryKey val planetId: Int,
    @ColumnInfo(name = "name") val planetName: String?,
    val overview: String?,
) {
    fun toPlanetsModel(): PlanetsModel = PlanetsModel(
        id = planetId,
        name = planetName,
        overview = overview
    )
}
