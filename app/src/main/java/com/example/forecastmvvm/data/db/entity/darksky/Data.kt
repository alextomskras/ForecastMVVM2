package com.example.forecastmvvm.data.db.entity.darksky


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("time")
    val time: Int, // 1574236800
    @SerializedName("summary")
    val summary: String, // Clear throughout the day.
    @SerializedName("icon")
    val icon: String, // clear-day
    @SerializedName("sunriseTime")
    val sunriseTime: Int, // 1574261820
    @SerializedName("sunsetTime")
    val sunsetTime: Int, // 1574297820
    @SerializedName("moonPhase")
    val moonPhase: Double, // 0.8
    @SerializedName("precipIntensity")
    val precipIntensity: Double, // 0.0002
    @SerializedName("precipIntensityMax")
    val precipIntensityMax: Double, // 0.0013
    @SerializedName("precipIntensityMaxTime")
    val precipIntensityMaxTime: Int, // 1574316360
    @SerializedName("precipProbability")
    val precipProbability: Double, // 0.08
    @SerializedName("temperatureHigh")
    val temperatureHigh: Double, // 63.17
    @SerializedName("temperatureHighTime")
    val temperatureHighTime: Int, // 1574289120
    @SerializedName("temperatureLow")
    val temperatureLow: Double, // 54.76
    @SerializedName("temperatureLowTime")
    val temperatureLowTime: Int, // 1574347800
    @SerializedName("apparentTemperatureHigh")
    val apparentTemperatureHigh: Double, // 62.67
    @SerializedName("apparentTemperatureHighTime")
    val apparentTemperatureHighTime: Int, // 1574289120
    @SerializedName("apparentTemperatureLow")
    val apparentTemperatureLow: Double, // 55.25
    @SerializedName("apparentTemperatureLowTime")
    val apparentTemperatureLowTime: Int, // 1574347800
    @SerializedName("dewPoint")
    val dewPoint: Double, // 51.32
    @SerializedName("humidity")
    val humidity: Double, // 0.79
    @SerializedName("pressure")
    val pressure: Double, // 1011.4
    @SerializedName("windSpeed")
    val windSpeed: Double, // 4.95
    @SerializedName("windGust")
    val windGust: Double, // 20.74
    @SerializedName("windGustTime")
    val windGustTime: Int, // 1574239620
    @SerializedName("windBearing")
    val windBearing: Int, // 299
    @SerializedName("cloudCover")
    val cloudCover: Double, // 0.03
    @SerializedName("uvIndex")
    val uvIndex: Int, // 3
    @SerializedName("uvIndexTime")
    val uvIndexTime: Int, // 1574279820
    @SerializedName("visibility")
    val visibility: Int, // 10
    @SerializedName("ozone")
    val ozone: Int, // 261
    @SerializedName("temperatureMin")
    val temperatureMin: Double, // 51.86
    @SerializedName("temperatureMinTime")
    val temperatureMinTime: Int, // 1574261220
    @SerializedName("temperatureMax")
    val temperatureMax: Double, // 63.17
    @SerializedName("temperatureMaxTime")
    val temperatureMaxTime: Int, // 1574289120
    @SerializedName("apparentTemperatureMin")
    val apparentTemperatureMin: Double, // 52.35
    @SerializedName("apparentTemperatureMinTime")
    val apparentTemperatureMinTime: Int, // 1574261220
    @SerializedName("apparentTemperatureMax")
    val apparentTemperatureMax: Double, // 62.67
    @SerializedName("apparentTemperatureMaxTime")
    val apparentTemperatureMaxTime: Int, // 1574289120
    @SerializedName("precipType")
    val precipType: String // rain
)