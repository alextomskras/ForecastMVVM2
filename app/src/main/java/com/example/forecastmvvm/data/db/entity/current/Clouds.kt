package com.example.forecastmvvm.data.db.entity.current

import com.google.gson.annotations.SerializedName

data class Clouds(
    @field:SerializedName("all")
    val all: Int? // 40
)