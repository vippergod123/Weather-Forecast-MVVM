package com.duyts.weathermvvm.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.duyts.weathermvvm.data.db.entity.CURRENT_WEATHER_ID
import com.duyts.weathermvvm.data.db.entity.CurrentWeatherEntry
import com.duyts.weathermvvm.data.db.unitlocalized.ImperialCurrentWeatherEntry
import com.duyts.weathermvvm.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

@Dao
interface CurrentWeatherDao {
    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    fun updateInsert( weatherEntry: CurrentWeatherEntry)

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeather(): LiveData<ImperialCurrentWeatherEntry>
}