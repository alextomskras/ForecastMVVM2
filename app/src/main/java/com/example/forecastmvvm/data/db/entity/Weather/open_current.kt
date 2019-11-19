package com.example.forecastmvvm.data.db.entity.Weather


import com.google.gson.annotations.SerializedName

data class open_current(
    @SerializedName("coord")
    val coord: Coord,
    @SerializedName("weather")
    val weather: List<Weather>,
    @SerializedName("base")
    val base: String, // stations
    @SerializedName("main")
    val main: Main,
    @SerializedName("visibility")
    val visibility: Int, // 16093
    @SerializedName("wind")
    val wind: Wind,
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("dt")
    val dt: Int, // 1572951618
    @SerializedName("sys")
    val sys: Sys,
    @SerializedName("timezone")
    val timezone: Int, // -28800
    @SerializedName("id")
    val id: Int, // 5601538
    @SerializedName("name")
    val name: String, // Moscow
    @SerializedName("cod")
    val cod: Int // 200
)