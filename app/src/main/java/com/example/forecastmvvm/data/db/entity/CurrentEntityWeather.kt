package com.example.forecastmvvm.data.db.entity


import androidx.room.*
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken


const val ENTITY_WEATHER_ID = 0

@Entity(tableName = "Entity_weather")
data class CurrentEntityWeather(
    @SerializedName("cod")
    val cod: String,
    @SerializedName("message")
    val message: Int,
    @SerializedName("cnt")
    val cnt: Int,
//    @Embedded(prefix = "list_")
    @TypeConverters(ListConverter::class)
    val list: List<X>,
//    @SerializedName("city")
    @Embedded(prefix = "city_")
    val city: City
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = ENTITY_WEATHER_ID
}

class ListConverter {
    private val gson = Gson()
    private val type = object : TypeToken<List<X>>() {

    }.type

    @TypeConverter
    fun stringToNestedData(json: String): List<X> {
        return gson.fromJson(json, type)
    }

    @TypeConverter
    fun nestedDataToString(nestedData: List<X>): String {
        return gson.toJson(nestedData, type)
    }
}
