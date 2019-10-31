package com.example.forecastmvvm.data.db.entity.current.back


import com.google.gson.annotations.SerializedName

data class Sys(
    @SerializedName("country")
    val country: String, // RU
    @SerializedName("id")
    val id: Int, // 9029
    @SerializedName("sunrise")
    val sunrise: Int, // 1572496341
    @SerializedName("sunset")
    val sunset: Int, // 1572530028
    @SerializedName("type")
    val type: Int // 1
)