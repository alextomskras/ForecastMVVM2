package com.example.forecastmvvm.data.network.response


import com.example.forecastmvvm.data.db.entity.current.*

import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("coord")
    val coord: Coord,
    @SerializedName("main")
    val main: Main,
    @field:SerializedName("visibility")
    val visibility: Int? = null,
    @field:SerializedName("weather")
    val weather: List<Weather?>? = null,
//    @SerializedName("weather")
//    val weather: Weather,
    @field:SerializedName("wind")
    val wind: Wind?,
//    val unit: Units,
    @field:SerializedName("sys")
    val currentWeatherEntity: CurrentWeatherEntity
)