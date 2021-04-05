package com.duyts.weathermvvm.data.db.unitlocalized

import androidx.room.ColumnInfo

data class ImperialCurrentWeatherEntry(
    @ColumnInfo(name = "observationTime")
    override val observationTime: String,
    @ColumnInfo(name = "visibility")
    override val visibility: Int,
    @ColumnInfo(name = "isDay")
    override val isDay: String,
    @ColumnInfo(name = "uvIndex")
    override val uvIndex: Int,
    @ColumnInfo(name = "temperature")
    override val temperature: Int,
    @ColumnInfo(name = "windSpeed")
    override val windSpeed: Int,
    @ColumnInfo(name = "weatherCode")
    override val weatherCode: Int
) : UnitSpecificCurrentWeatherEntry