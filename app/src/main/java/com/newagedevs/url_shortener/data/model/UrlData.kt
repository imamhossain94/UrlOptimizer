package com.newagedevs.url_shortener.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "url_data")
data class UrlData(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    var provider: String? = null,
    val originalUrl: String? = null,
    val shortenedUrl: String? = null,
    val expandedUrl: String? = null,
    val success: Boolean? = null,
    val timestamp: Long = System.currentTimeMillis()
)
