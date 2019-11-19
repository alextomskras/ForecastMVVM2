package com.example.forecastmvvm.data.db.entity.darksky


import com.google.gson.annotations.SerializedName

data class Flags(
    @SerializedName("sources")
    val sources: List<String>,
    @SerializedName("nearest-station")
    val nearestStation: Double, // 2.24
    @SerializedName("units")
    val units: String // us
)