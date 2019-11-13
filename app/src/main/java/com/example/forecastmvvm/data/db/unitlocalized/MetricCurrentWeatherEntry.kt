package com.example.forecastmvvm.data.db.unitlocalized

import androidx.room.ColumnInfo


data class MetricCurrentWeatherEntry(
    @ColumnInfo(name = "id")
    override val temperature: Int,
//    @ColumnInfo(name = "weather_description")
//    override val conditionText: String,
//    @ColumnInfo(name = "weather_icon")
//    override val conditionIconUrl: String = "openweathermap.org/img/wn/01d@2x.png",
    @ColumnInfo(name = "main")
    override val windSpeed: String,
    @ColumnInfo(name = "description")
    override val windDirection: String,
    @ColumnInfo(name = "icon")
    override val precipitationVolume: String
//    @ColumnInfo(name = "main_tempMax")
//    override val feelsLikeTemperature: Double,
//    @ColumnInfo(name = "main_humidity")
//    override val visibilityDistance: Double
) : UnitSpecificCurrentWeatherEntry