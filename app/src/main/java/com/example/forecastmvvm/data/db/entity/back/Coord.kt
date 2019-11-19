package com.example.forecastmvvm.data.db.entity.back


import com.google.gson.annotations.SerializedName

data class Coord(
    @SerializedName("lat")
    val lat: Double, // 55.75
    @SerializedName("lon")
    val lon: Double // 37.62
)