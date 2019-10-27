package com.example.forecastmvvm.data.db.entity.Current


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

import com.google.gson.annotations.SerializedName


const val CURRENT_ENTITY_WEATHER_ID = 0

@Entity(tableName = "Current_Entity_weather")

data class CurrentWeatherEntity(
    @Embedded(prefix = "coord_")
    val coord: Coord,
    @Embedded(prefix = "weather_")
    val weather: Weather,
    @SerializedName("base")
    val base: String, // stations
    @Embedded(prefix = "main_")
    val main: Main,
    @SerializedName("visibility")
    val visibility: Double, // 10000
    @Embedded(prefix = "wind_")
    val wind: Wind,
    @Embedded(prefix = "clouds_")
    val clouds: Clouds,
    @SerializedName("dt")
    val dt: Double, // 1485790200
    @Embedded(prefix = "sys_")
    val sys: Sys,
//    @SerializedName("id")
////    @PrimaryKey
//    val cid: Int, // 2172797
    @SerializedName("name")
    val name: String, // Cairns
    @SerializedName("cod")
    val cod: Double // 200
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_ENTITY_WEATHER_ID
}

//class Book : SugarRecord() {
//    private val id: Long = 0
//    internal var name: String? = null
//    internal var ISBN: String? = null
//    internal var title: String? = null
//    internal var shortSummary: String? = null
//
//    internal var author: Author? = null
//
//    fun getId(): Long? {
//        return id
//    }
//}