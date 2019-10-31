package com.example.forecastmvvm.data.db.entity.forecast


import com.google.gson.annotations.SerializedName

data class Main(
    val humidity: Int = 0, // 81
    val pressure: Int = 0, // 1012
    val temp: Double = 0.0, // 280.32
    @SerializedName("temp_max")
    val tempMax: Double = 0.0, // 281.15
    @SerializedName("temp_min")
    val tempMin: Double = 0.0 // 279.15
)