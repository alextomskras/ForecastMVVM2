package com.example.forecastmvvm.data.db.entity.darksky


import com.google.gson.annotations.SerializedName

data class dark_current(
    @SerializedName("latitude")
    val latitude: Double, // 37.8267
    @SerializedName("longitude")
    val longitude: Double, // -122.4233
    @SerializedName("timezone")
    val timezone: String, // America/Los_Angeles
    @SerializedName("currently")
    val currently: Currently,
    @SerializedName("daily")
    val daily: Daily,
    @SerializedName("alerts")
    val alerts: List<Alert>,
    @SerializedName("flags")
    val flags: Flags,
    @SerializedName("offset")
    val offset: Int // -8
)