package com.example.forecastmvvm.data.db.entity.darksky


import com.google.gson.annotations.SerializedName

data class Daily(
    @SerializedName("summary")
    val summary: String, // No precipitation throughout the week.
    @SerializedName("icon")
    val icon: String, // clear-day
    @SerializedName("data")
    val `data`: List<Data>
)