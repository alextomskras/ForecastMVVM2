package com.example.forecastmvvm.data.network.response


import com.example.forecastmvvm.data.db.entity.current.*

data class CurrentWeatherResponse(

//    @field:SerializedName("clouds")
//    val clouds: Clouds,
//    @field:SerializedName("coord")
//    val coord: Coord,
//    @field:SerializedName("main")
//    val main: Main,
//    @field:SerializedName("visibility")
//    val visibility: Int,
//    @field:SerializedName("weather")
////    @Embedded(prefix = "weather_")
//    val weather: Weather,
//////    @SerializedName("weather")
//////    val weather: Weather,
////    @field:SerializedName("wind")
////    val wind: Wind,
//////    val unit: Units,
////    @field:SerializedName("sys")
//    @field:SerializedName("coord")
//    val currentWeatherEntity: CurrentWeatherEntity
    val base: String, // stations
    val clouds: Clouds,
    val cod: Int, // 200
    val coord: Coord,
    val dt: Int, // 1485789600
    val id: Int, // 2643743
    val main: Main,
    val name: String, // London
    val sys: Sys,
    val visibility: Int, // 10000
    val weather: List<Weather>,
    val wind: Wind
)