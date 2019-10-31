package com.example.forecastmvvm.data.db.entity.current


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.forecastmvvm.data.db.entity.forecast.Wind
import com.google.gson.annotations.SerializedName


const val CURRENT_ENTITY_WEATHER_ID = 0

@Entity(tableName = "current_entity_weather")

data class CurrentWeatherEntity(

//    val id : Int,
//    @SerializedName("coord")
//    @Embedded(prefix = "crd_")
//    val coord: Coord,
//    @Embedded(prefix = "weather_")
//    val weather: Array<Weather>,
//    val base: String, // stations
    @Embedded(prefix = "main_")
    @SerializedName("main")
    val main: Main,
//    @SerializedName("visibility")
//    val visibility: Int, // 10000
    @Embedded(prefix = "wind_")
    @SerializedName("wind")
    val wind: Wind? = null,
    @field:SerializedName("clouds")
    @Embedded(prefix = "clouds_")
    val clouds: Clouds = Clouds(0),
//    val dt: Double, // 1485790200
    @field:SerializedName("sys")
    @Embedded(prefix = "sys_")
    val sys: Sys? = null

//    @PrimaryKey(autoGenerate = false)
//    val id: Int, // 2172797
//    val name: String, // Cairns
//    val cod: Int // 200
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int? = CURRENT_ENTITY_WEATHER_ID
}


