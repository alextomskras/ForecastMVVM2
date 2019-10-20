package com.example.forecastmvvm.data.db.entity


data class ResponceCurrentEntity(
    val cod: String,
    val message: Double,
    val cnt: Int,
    val list: List<X>,
    val city: City
)