package com.example.forecastmvvm.data.network.response


import com.example.forecastmvvm.data.db.entity.current.*

import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    @field:SerializedName("clouds")
    val clouds: Clouds,
    @field:SerializedName("coord")
    val coord: Coord,
    @field:SerializedName("main")
    val main: Main,
    @field:SerializedName("visibility")
    val visibility: Int,
    @field:SerializedName("weather")
    val weather: List<Weather>,
//    @SerializedName("weather")
//    val weather: Weather,
    @field:SerializedName("wind")
    val wind: Wind,
//    val unit: Units,
    @field:SerializedName("sys")
    val currentWeatherEntity: CurrentWeatherEntity
)