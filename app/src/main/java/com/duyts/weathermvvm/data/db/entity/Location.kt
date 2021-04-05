package com.duyts.weathermvvm.data.db.entity

import com.google.gson.annotations.SerializedName

data class Location(

	@field:SerializedName("localtime")
	val localtime: String,

	@field:SerializedName("utc_offset")
	val utcOffset: String,

	@field:SerializedName("country")
	val country: String,

	@field:SerializedName("localtime_epoch")
	val localtimeEpoch: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("timezone_id")
	val timezoneId: String,

	@field:SerializedName("lon")
	val lon: String,

	@field:SerializedName("region")
	val region: String,

	@field:SerializedName("lat")
	val lat: String
)