package com.duyts.weathermvvm.data.response

import com.google.gson.annotations.SerializedName

data class Request(

	@field:SerializedName("unit")
	val unit: String,

	@field:SerializedName("query")
	val query: String,

	@field:SerializedName("language")
	val language: String,

	@field:SerializedName("type")
	val type: String
)