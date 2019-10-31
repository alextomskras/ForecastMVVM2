package com.example.forecastmvvm.data.db.entity.current

import com.google.gson.annotations.SerializedName

data class Coord(
    @field:SerializedName("lon")
    val lon: Double? = null, // 145.77
    @field:SerializedName("lat")
    val lat: Double? = null // -16.92
)