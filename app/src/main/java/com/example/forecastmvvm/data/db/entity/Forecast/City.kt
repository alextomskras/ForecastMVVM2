package com.example.forecastmvvm.data.db.entity.Forecast


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val CITY_WEATHER_ID = 0

@Entity(tableName = "City_weather")
data class City(
    @SerializedName("id")
    val idcity: Int,
    @SerializedName("name")
    val name: String,
//    @SerializedName("coord")
    @Embedded(prefix = "coord_")
    val coord: Coord,
    @SerializedName("country")
    val country: String,
    @SerializedName("population")
    val population: Int,
    @SerializedName("timezone")
    val timezone: Int,
    @SerializedName("sunrise")
    val sunrise: Int,
    @SerializedName("sunset")
    val sunset: Int
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CITY_WEATHER_ID
}