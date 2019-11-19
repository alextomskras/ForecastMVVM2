package com.example.forecastmvvm.data.network

//import sun.util.logging.LoggingSupport.setLevel
import com.example.forecastmvvm.data.network.response.CurrentWeatherResponse
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "f9d142fda1995a149d1b35f11bc9a928"
//OLD-const val API_KEY = "e3b4ae74af25401a849181235180512"
//NEW_WEATHERCAST_const val API_KEY = "3e735f3d35d2f20f7604151dd0742757"
//API-KEY-NEW 3e735f3d35d2f20f7604151dd0742757


//WEATHER_ICON
//DAY-CLEAR-SKY-http://openweathermap.org/img/wn/01d@2x.png

//https://samples.openweathermap.org/data/2.5/weather?id=524901&appid=b1b15e88fa797225412429c1c50c122a1
//https://api.openweathermap.org/data/2.5/forecast?q=London,us
//https://samples.openweathermap.org/data/2.5/forecast?id=524901&appid=b1b15e88fa797225412429c1c50c122a1
//http://api.weatherstack.com/current?access_key=3e735f3d35d2f20f7604151dd0742757&query=New%20York
//http://api.weatherstack.com/current?key=3e735f3d35d2f20f7604151dd0742757&q=New%20York
//http://api.apixu.com/v1/current.json?key=89e8bd89085b41b7a4b142029180210&q=London&lang=en
//http://api.apixu.com/v1/current.json?key=e3b4ae74af25401a849181235180512&q=London&lang=en

//157e309f67a840baa3f0cf1f96bb1a04 	Master API Key
//157e309f67a840baa3f0cf1f96bb1a04
//https://api.weatherbit.io/v2.0/forecast/daily?city_id=moscow&days=7&units=S&key=157e309f67a840baa3f0cf1f96bb1a04


//DARK-SKY-API
//API-KEY 36156a6fc6d532128065d7c2efaf8157
//https://api.darksky.net/forecast/36156a6fc6d532128065d7c2efaf8157/37.8267,-122.4233



interface ApixuWeatherApiService {

    @GET("data/2.5/weather")
    fun getCurrentWeather(
        @Query("q") location: String,
        @Query("lang") languageCode: String = "en",
        @Query("units") units: String = "metric"

    ): Deferred<CurrentWeatherResponse>

    companion object {
        operator fun invoke(
            connectivityInterceptor: ConnectivityInterceptor
        ): ApixuWeatherApiService {
//            val logging = HttpLoggingInterceptor()
//            logging.level = HttpLoggingInterceptor.Level.BASIC
            val requestInterceptor = Interceptor { chain ->

                val url = chain.request()
                    .url
                    .newBuilder()
                    .addQueryParameter("appid", API_KEY)
                    .build()
                val request = chain.request()
                    .newBuilder()
                    .url(url)
                    .build()

                return@Interceptor chain.proceed(request)
            }

            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(requestInterceptor)
                .addInterceptor(logging)
                .addInterceptor(connectivityInterceptor)
                .build()

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://api.openweathermap.org/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApixuWeatherApiService::class.java)
        }
    }
}