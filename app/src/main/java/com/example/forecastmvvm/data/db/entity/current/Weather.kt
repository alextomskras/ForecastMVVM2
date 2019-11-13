package com.example.forecastmvvm.data.db.entity.current

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName

const val OPEN_CURRENT_ENTITY_WEATHER_ID = 0

@Entity(tableName = "open_current_entity_weather")
@TypeConverters(ListStringConverter::class)
data class Weather(
//    @SerializedName("id")
//    val id: Int, // 802

//    @ColumnInfo(name = "w_id")
//    val id: Int, // 802
    @SerializedName("main")
    val main: String, // Clouds
    @SerializedName("description")
    val description: String, // scattered clouds
    @SerializedName("icon")
    val icon: String // 03n
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int? = OPEN_CURRENT_ENTITY_WEATHER_ID
}