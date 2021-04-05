package com.duyts.weathermvvm.data

import com.duyts.weathermvvm.data.network.response.CurrentWeatherResponse
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


const val API_KEY = "0bb83b8d3dc8f0bb58b5c336bba20c63"
const val DOMAIN = "http://api.weatherstack.com/"

//http://api.weatherstack.com/current?access_key=0bb83b8d3dc8f0bb58b5c336bba20c63&query=New%20York
interface WeatherApiService {
    companion object {
        operator fun invoke(): WeatherApiService {
            val requestInterceptor = Interceptor { chain ->
                val url =
                    chain.request().url().newBuilder().addQueryParameter("access_key", API_KEY)
                        .build()

                val request = chain.request().newBuilder().url(url).build()
                return@Interceptor chain.proceed(request)
            }
            val okHttpClient = OkHttpClient.Builder().addInterceptor(requestInterceptor).build()
            return Retrofit.Builder().client(okHttpClient).baseUrl(DOMAIN)
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(WeatherApiService::class.java)
        }

    }

    @GET("current")
    fun getCurrentWeather(@Query("query") location: String): Deferred<CurrentWeatherResponse>
}