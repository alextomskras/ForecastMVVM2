package com.example.forecastmvvm.data.db.entity.forecast


data class EntityCurr(
    val base: String = "", // stations
    val clouds: Clouds = Clouds(),
    val cod: Int = 0, // 200
    val coord: Coord = Coord(),
    val dt: Int = 0, // 1485789600
    val id: Int = 0, // 2643743
    val main: Main = Main(),
    val name: String = "", // London
    val sys: Sys = Sys(),
    val visibility: Int = 0, // 10000
    val weather: List<Weather> = listOf(),
    val wind: Wind = Wind()
)