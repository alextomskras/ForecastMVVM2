package com.example.forecastmvvm.data.db.entity.Weather


import com.google.gson.annotations.SerializedName

data class Main(
    @SerializedName("temp")
    val temp: Double, // 274.83
    @SerializedName("pressure")
    val pressure: Int, // 1021
    @SerializedName("humidity")
    val humidity: Int, // 80
    @SerializedName("temp_min")
    val tempMin: Double, // 269.26
    @SerializedName("temp_max")
    val tempMax: Double // 280.93
)