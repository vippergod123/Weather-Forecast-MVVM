package com.duyts.weathermvvm.data.response

import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(

    @field:SerializedName("request")
	val request: Request,

    @field:SerializedName("current")
	val currentWeatherEntry: CurrentWeatherEntry,

    @field:SerializedName("location")
	val location: Location
)