package com.duyts.weathermvvm.data.db.unitlocalized

interface UnitSpecificCurrentWeatherEntry {
    val observationTime: String
    val visibility: Int
    val isDay: String
    val uvIndex: Int
    val temperature: Int
    val windSpeed: Int
    val weatherCode: Int
}