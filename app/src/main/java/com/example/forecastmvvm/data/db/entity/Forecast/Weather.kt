package com.example.forecastmvvm.data.db.entity.Forecast


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val TEMP_WEATHER_ID = 0

@Entity(tableName = "Main_weather")
data class Weather(
    @SerializedName("id")
    val idWeather: Int,
    @SerializedName("main")
    val main: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("icon")
    val icon: String
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = TEMP_WEATHER_ID
}