package com.example.forecastmvvm.data.db.entity.back


import com.google.gson.annotations.SerializedName

data class test15(
    @SerializedName("base")
    val base: String, // stations
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("cod")
    val cod: Int, // 200
    @SerializedName("coord")
    val coord: Coord,
    @SerializedName("dt")
    val dt: Int, // 1572544648
    @SerializedName("id")
    val id: Int, // 524901
    @SerializedName("main")
    val main: Main,
    @SerializedName("name")
    val name: String, // Moscow
    @SerializedName("sys")
    val sys: Sys,
    @SerializedName("timezone")
    val timezone: Int, // 10800
    @SerializedName("visibility")
    val visibility: Int, // 10000
    @SerializedName("weather")
    val weather: List<Weather>,
    @SerializedName("wind")
    val wind: Wind
)