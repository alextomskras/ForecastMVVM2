package com.example.forecastmvvm.data.db.entity.darksky


import com.google.gson.annotations.SerializedName

data class Currently(
    @SerializedName("time")
    val time: Int, // 1573717535
    @SerializedName("summary")
    val summary: String, // Mostly Cloudy
    @SerializedName("icon")
    val icon: String, // partly-cloudy-night
    @SerializedName("nearestStormDistance")
    val nearestStormDistance: Int, // 1
    @SerializedName("nearestStormBearing")
    val nearestStormBearing: Int, // 255
    @SerializedName("precipIntensity")
    val precipIntensity: Double, // 0.002
    @SerializedName("precipIntensityError")
    val precipIntensityError: Double, // 0.001
    @SerializedName("precipProbability")
    val precipProbability: Double, // 0.13
    @SerializedName("precipType")
    val precipType: String, // rain
    @SerializedName("temperature")
    val temperature: Double, // 53.81
    @SerializedName("apparentTemperature")
    val apparentTemperature: Double, // 53.81
    @SerializedName("dewPoint")
    val dewPoint: Double, // 48.15
    @SerializedName("humidity")
    val humidity: Double, // 0.81
    @SerializedName("pressure")
    val pressure: Double, // 1016.8
    @SerializedName("windSpeed")
    val windSpeed: Double, // 4.8
    @SerializedName("windGust")
    val windGust: Double, // 9.86
    @SerializedName("windBearing")
    val windBearing: Int, // 253
    @SerializedName("cloudCover")
    val cloudCover: Double, // 0.78
    @SerializedName("uvIndex")
    val uvIndex: Int, // 0
    @SerializedName("visibility")
    val visibility: Double, // 9.13
    @SerializedName("ozone")
    val ozone: Double // 260.4
)