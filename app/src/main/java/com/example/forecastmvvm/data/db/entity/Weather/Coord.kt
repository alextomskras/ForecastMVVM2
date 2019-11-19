package com.example.forecastmvvm.data.db.entity.Weather


import com.google.gson.annotations.SerializedName

data class Coord(
    @SerializedName("lon")
    val lon: Int, // -117
    @SerializedName("lat")
    val lat: Double // 46.73
)