package com.newagedevs.url_shortener.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.newagedevs.url_shortener.model.Model

@Database(entities = [Model::class], version = 1, exportSchema = true)
@TypeConverters(value = [])
abstract class AppDatabase : RoomDatabase() {

    abstract fun modelDao(): ModelDao

}
