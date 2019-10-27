package com.example.forecastmvvm.data.db.entity.Forecast


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


const val X_WEATHER_ID = 0

@Entity(tableName = "X_weather")
data class X(
    val dt: Int,
    @Embedded(prefix = "main_")
    val main: Main,
    @Embedded(prefix = "weather_")
    val weather: List<Weather>,
    @Embedded(prefix = "clouds_")
    val clouds: Clouds,
    @Embedded(prefix = "wind_")
    val wind: Wind,
    val sys: Sys,
    @SerializedName("dt_txt")
    val dtTxt: String,
    val rain: Rain
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = X_WEATHER_ID
}