package com.example.forecastmvvm.data.db.entity.Forecast


import com.google.gson.annotations.SerializedName

data class Rain(
    @SerializedName("3h")
    val h: Double
)