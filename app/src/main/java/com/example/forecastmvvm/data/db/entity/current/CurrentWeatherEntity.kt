package com.example.forecastmvvm.data.db.entity.current


import androidx.room.*
import com.example.forecastmvvm.data.db.entity.forecast.Wind
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken


const val CURRENT_ENTITY_WEATHER_ID = 0

@Entity(tableName = "current_entity_weather")
@TypeConverters(GenreConverter::class)
data class CurrentWeatherEntity(

//    val id : Int,
    @field:SerializedName("coord")
    @Embedded(prefix = "crd_")
    val coord: Coord?,
    @field:SerializedName("base")
    val base: String?, // stations
//    @Embedded(prefix = "weather_")
    val weather: List<String>,
//    val base: String, // stations
    @SerializedName("cod")
    val cod: Int, // 200
    @SerializedName("dt")
    val dt: Int, // 1572544648
    @SerializedName("name")
    val name: String?, // Moscow
    @Embedded(prefix = "main_")
    @SerializedName("main")
    val main: Main,
    @SerializedName("visibility")
    val visibility: Int, // 10000
    @Embedded(prefix = "wind_")
    @SerializedName("wind")
    val wind: Wind? = null,
    @field:SerializedName("clouds")
    @Embedded(prefix = "clouds_")
    val clouds: Clouds,
//    val dt: Double, // 1485790200
    @field:SerializedName("sys")
    @Embedded(prefix = "sys_")
    val sys: Sys

//    @PrimaryKey(autoGenerate = false)
//    val id: Int, // 2172797
//    val name: String, // Cairns
//    val cod: Int // 200
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int? = CURRENT_ENTITY_WEATHER_ID
}

class GenreConverter {
    @TypeConverter
    fun toGenre(json: String): List<String> {
        val type = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson(json, type)
    }

    @TypeConverter
    fun toJson(genres: List<String>) = Gson().toJson(genres)
}

class Converters {
    @TypeConverter
    fun fromString(value: String): ArrayList<String> {
        val listType = object : TypeToken<ArrayList<String>>() {

        }.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromArrayList(list: ArrayList<String>): String {
        val gson = Gson()
        return gson.toJson(list)
    }
}


