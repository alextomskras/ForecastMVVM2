package com.example.forecastmvvm.data.db.entity.current

import com.google.gson.annotations.SerializedName

data class Wind(
    @field:SerializedName("speed")
    val speed: Double? = null, // 3.6
    @field:SerializedName("deg")
    val deg: Double? = null, // 160
    @field:SerializedName("humidity")
    val humidity: Int? = null
)