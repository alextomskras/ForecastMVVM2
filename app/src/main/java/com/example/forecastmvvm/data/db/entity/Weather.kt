package com.example.forecastmvvm.data.db.entity


data class Weather(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)