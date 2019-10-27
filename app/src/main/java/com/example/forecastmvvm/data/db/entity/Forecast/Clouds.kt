package com.example.forecastmvvm.data.db.entity.Forecast


import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("all")
    val all: Int
)