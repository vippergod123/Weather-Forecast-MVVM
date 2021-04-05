package com.duyts.weathermvvm.data.network.response

import com.duyts.weathermvvm.data.db.entity.CurrentWeatherEntry
import com.duyts.weathermvvm.data.db.entity.Location
import com.duyts.weathermvvm.data.db.entity.Request
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(

    @field:SerializedName("request")
	val request: Request,

    @field:SerializedName("current")
	val currentWeatherEntry: CurrentWeatherEntry,

    @field:SerializedName("location")
	val location: Location
)