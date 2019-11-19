package com.example.forecastmvvm.data.db.entity.Weather


import com.google.gson.annotations.SerializedName

data class Wind(
    @SerializedName("speed")
    val speed: Double, // 3.6
    @SerializedName("deg")
    val deg: Int // 70
)