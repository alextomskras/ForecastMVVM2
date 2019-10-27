package com.example.forecastmvvm.data.db.entity.Current

import com.google.gson.annotations.SerializedName

data class Main(
    val temp: Double, // 300.15
    val pressure: Double, // 1007
    val humidity: Double, // 74
    @SerializedName("temp_min")
    val tempMin: Double, // 300.15
    @SerializedName("temp_max")
    val tempMax: Double // 300.15
)