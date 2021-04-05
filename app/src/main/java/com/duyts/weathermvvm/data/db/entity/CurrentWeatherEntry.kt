package com.duyts.weathermvvm.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val CURRENT_WEATHER_ID = 0;
@Entity(tableName = "current_weather")
data class CurrentWeatherEntry(

	@field:SerializedName("weather_descriptions")
	val weatherDescriptions: List<String>,

	@field:SerializedName("observation_time")
	val observationTime: String,

	@field:SerializedName("wind_degree")
	val windDegree: Int,

	@field:SerializedName("visibility")
	val visibility: Int,

	@field:SerializedName("weather_icons")
	val weatherIcons: List<String>,

	@field:SerializedName("feelslike")
	val feelslike: Int,

	@field:SerializedName("is_day")
	val isDay: String,

	@field:SerializedName("wind_dir")
	val windDir: String,

	@field:SerializedName("pressure")
	val pressure: Int,

	@field:SerializedName("cloudcover")
	val cloudcover: Int,

	@field:SerializedName("precip")
	val precip: Int,

	@field:SerializedName("uv_index")
	val uvIndex: Int,

	@field:SerializedName("temperature")
	val temperature: Int,

	@field:SerializedName("humidity")
	val humidity: Int,

	@field:SerializedName("wind_speed")
	val windSpeed: Int,

	@field:SerializedName("weather_code")
	val weatherCode: Int
) {
	@PrimaryKey(autoGenerate = false)
	var id:Int = CURRENT_WEATHER_ID
}