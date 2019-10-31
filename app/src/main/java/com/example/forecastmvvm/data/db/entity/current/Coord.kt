package com.example.forecastmvvm.data.db.entity.current

import com.google.gson.annotations.SerializedName

data class Coord(
    @SerializedName("lon")
    val lon: Double, // 145.77
    @SerializedName("lat")
    val lat: Double // -16.92
)