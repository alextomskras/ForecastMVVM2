package com.example.forecastmvvm.data.db.entity.back


import com.google.gson.annotations.SerializedName

data class Main(
    @SerializedName("humidity")
    val humidity: Int, // 68
    @SerializedName("pressure")
    val pressure: Int, // 1021
    @SerializedName("temp")
    val temp: Double, // 270.43
    @SerializedName("temp_max")
    val tempMax: Double, // 271.48
    @SerializedName("temp_min")
    val tempMin: Double // 269.26
)