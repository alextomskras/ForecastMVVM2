package com.example.forecastmvvm.data.db.entity.Current


import com.google.gson.annotations.SerializedName

data class CurrentWeatherEntity(
    val coord: Coord,
    val weather: List<Weather>,
    val base: String, // stations
    val main: Main,
    val visibility: Int, // 10000
    val wind: Wind,
    val clouds: Clouds,
    val dt: Int, // 1485790200
    val sys: Sys,
    val id: Int, // 2172797
    val name: String, // Cairns
    val cod: Int // 200
) {
    data class Coord(
        val lon: Double, // 145.77
        val lat: Double // -16.92
    )

    data class Weather(
        val id: Int, // 802
        val main: String, // Clouds
        val description: String, // scattered clouds
        val icon: String // 03n
    )

    data class Main(
        val temp: Double, // 300.15
        val pressure: Int, // 1007
        val humidity: Int, // 74
        @SerializedName("temp_min")
        val tempMin: Double, // 300.15
        @SerializedName("temp_max")
        val tempMax: Double // 300.15
    )

    data class Wind(
        val speed: Double, // 3.6
        val deg: Int // 160
    )

    data class Clouds(
        val all: Int // 40
    )

    data class Sys(
        val type: Int, // 1
        val id: Int, // 8166
        val message: Double, // 0.2064
        val country: String, // AU
        val sunrise: Int, // 1485720272
        val sunset: Int // 1485766550
    )
}