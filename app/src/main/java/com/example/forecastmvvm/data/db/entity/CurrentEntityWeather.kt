package com.example.forecastmvvm.data.db.entity


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val ENTITY_WEATHER_ID = 0

@Entity(tableName = "Entity_weather")
data class CurrentEntityWeather(
    @SerializedName("cod")
    val cod: String,
    @SerializedName("message")
    val message: Int,
    @SerializedName("cnt")
    val cnt: Int,
    @Embedded(prefix = "list_")
    val list: List<X>,
    @SerializedName("city")
    @Embedded(prefix = "city_")
    val city: City
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = ENTITY_WEATHER_ID
}