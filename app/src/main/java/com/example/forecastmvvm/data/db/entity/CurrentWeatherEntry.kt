package com.example.forecastmvvm.data.db.entity


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val CURRENT_WEATHER_ID = 0

@Entity(tableName = "main_weather")
data class Main(
    val temp: Double,
    @SerializedName("temp_min")
    val tempMin: Double,
    @SerializedName("temp_max")
    val tempMax: Double,
    val pressure: Double,
    @SerializedName("sea_level")
    val seaLevel: Double,
    @SerializedName("grnd_level")
    val grndLevel: Double,
    val humidity: Int,
    @SerializedName("temp_kf")
    val tempKf: Int
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID
}