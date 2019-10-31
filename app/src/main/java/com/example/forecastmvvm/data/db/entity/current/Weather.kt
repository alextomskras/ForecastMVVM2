package com.example.forecastmvvm.data.db.entity.current

import com.google.gson.annotations.SerializedName

data class Weather(
    @field:SerializedName("id")
    val id: Int, // 802

//    @ColumnInfo(name = "w_id")
//    val id: Int, // 802
    @field:SerializedName("main")
    val main: String, // Clouds
    @field:SerializedName("description")
    val description: String, // scattered clouds
    @field:SerializedName("icon")
    val icon: String // 03n
)