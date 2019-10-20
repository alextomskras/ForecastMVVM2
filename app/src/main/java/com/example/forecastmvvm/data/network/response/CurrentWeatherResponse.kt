package com.example.forecastmvvm.data.network.response

import com.example.forecastmvvm.data.db.entity.CurrentWeatherEntryList
import com.example.forecastmvvm.data.db.entity.Location
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    val location: Location,
    @SerializedName("city")
    val currentWeatherEntryList: CurrentWeatherEntryList
)