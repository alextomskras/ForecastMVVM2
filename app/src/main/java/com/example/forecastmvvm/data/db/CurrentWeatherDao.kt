package com.example.forecastmvvm.data.db


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.forecastmvvm.data.db.entity.Current.CURRENT_ENTITY_WEATHER_ID
import com.example.forecastmvvm.data.db.entity.Current.CurrentWeatherEntity
import com.example.forecastmvvm.data.db.unitlocalized.ImperialCurrentWeatherEntry
import com.example.forecastmvvm.data.db.unitlocalized.MetricCurrentWeatherEntry


@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntity: CurrentWeatherEntity)

    @Query("select * from current_entity_weather where id = $CURRENT_ENTITY_WEATHER_ID ")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_entity_weather where id = $CURRENT_ENTITY_WEATHER_ID ")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>
}