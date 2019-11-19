package com.example.forecastmvvm.data.db.entity.Weather


import com.google.gson.annotations.SerializedName

data class Sys(
    @SerializedName("type")
    val type: Int, // 1
    @SerializedName("id")
    val id: Int, // 5430
    @SerializedName("country")
    val country: String, // US
    @SerializedName("sunrise")
    val sunrise: Int, // 1572964545
    @SerializedName("sunset")
    val sunset: Int // 1573000044
)