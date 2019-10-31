package com.example.forecastmvvm.data.db.unitlocalized

import androidx.room.ColumnInfo


data class MetricCurrentWeatherEntry(
    @ColumnInfo(name = "main_temp")
    override val temperature: Double,
//    @ColumnInfo(name = "weather_description")
//    override val conditionText: String,
//    @ColumnInfo(name = "weather_icon")
//    override val conditionIconUrl: String = "openweathermap.org/img/wn/01d@2x.png",
    @ColumnInfo(name = "wind_speed")
    override val windSpeed: Double,
    @ColumnInfo(name = "sys_sunrise")
    override val windDirection: String,
    @ColumnInfo(name = "main_pressure")
    override val precipitationVolume: Double,
    @ColumnInfo(name = "main_tempMax")
    override val feelsLikeTemperature: Double,
    @ColumnInfo(name = "main_humidity")
    override val visibilityDistance: Double
) : UnitSpecificCurrentWeatherEntry