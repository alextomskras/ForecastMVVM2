package com.example.forecastmvvm.data.network.response

import com.example.forecastmvvm.data.db.entity.Forecast.CurrentWeatherEntryList
import com.example.forecastmvvm.data.db.entity.Forecast.Location
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    val location: Location,
//    val unit: Units,
    @SerializedName("city")
    val currentWeatherEntryList: CurrentWeatherEntryList
)