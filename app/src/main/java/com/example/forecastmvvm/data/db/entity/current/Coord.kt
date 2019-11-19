package com.example.forecastmvvm.data.db.entity.current

import com.google.gson.annotations.SerializedName

data class Coord(
    @field:SerializedName("lon")
    val lon: Double?,
    @field:SerializedName("lat")
    val lat: Double?
)