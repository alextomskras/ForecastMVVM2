package com.example.forecastmvvm.data.db.entity.current.back


import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("description")
    val description: String, // broken clouds
    @SerializedName("icon")
    val icon: String, // 04n
    @SerializedName("id")
    val id: Int, // 803
    @SerializedName("main")
    val main: String // Clouds
)