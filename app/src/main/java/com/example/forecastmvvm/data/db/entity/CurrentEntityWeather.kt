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
//    @Embedded(prefix = "list_")
//    @TypeConverters(ListConverter::class)
    var list: List<X>,
//    @SerializedName("city")
    @Embedded(prefix = "city_")
    val city: City
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = ENTITY_WEATHER_ID
}

//class ListConverter {
////    private val gson = Gson()
////    private val type = object : TypeToken<MutableList<X>>() {
////
////    }.type
//companion object{
//    @TypeConverter
////    @JvmStatic
//    fun stringToNestedData(json: String?): MutableList<X> {
////        return gson.fromJson(json, type)
//        return MutableList<X>()
//    }
//
//    @TypeConverter
////    @JvmStatic
//    fun nestedDataToString(nestedData: MutableList<X>): String {
////        return gson.toJson(nestedData, type)
//        return toString()
//    }
//}
//
//}
