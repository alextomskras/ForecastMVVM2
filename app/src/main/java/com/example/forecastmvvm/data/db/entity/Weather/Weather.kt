package com.example.forecastmvvm.data.db.entity.Weather


import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("id")
    val id: Int, // 800
    @SerializedName("main")
    val main: String, // Clear
    @SerializedName("description")
    val description: String, // clear sky
    @SerializedName("icon")
    val icon: String // 01n
)