package com.example.forecastmvvm.data.network.response

import android.location.Location
import com.example.forecastmvvm.data.db.entity.Current.CurrentWeatherEntity
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    val location: Location,
//    val unit: Units,
    @SerializedName("city")
    val currentWeatherEntity: CurrentWeatherEntity
)