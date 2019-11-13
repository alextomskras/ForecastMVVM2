package com.example.forecastmvvm.data.db


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.forecastmvvm.data.db.entity.current.OPEN_CURRENT_ENTITY_WEATHER_ID
import com.example.forecastmvvm.data.db.entity.current.Weather

import com.example.forecastmvvm.data.db.unitlocalized.ImperialCurrentWeatherEntry
import com.example.forecastmvvm.data.db.unitlocalized.MetricCurrentWeatherEntry


@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntity: List<Weather>)

    @Query("select * from open_current_entity_weather where id = $OPEN_CURRENT_ENTITY_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from open_current_entity_weather where id = $OPEN_CURRENT_ENTITY_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>
}