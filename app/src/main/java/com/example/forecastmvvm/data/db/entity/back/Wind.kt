package com.example.forecastmvvm.data.db.entity.back


import com.google.gson.annotations.SerializedName

data class Wind(
    @SerializedName("deg")
    val deg: Int, // 280
    @SerializedName("speed")
    val speed: Int // 4
)