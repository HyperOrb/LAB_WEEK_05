// In file: ImageData.kt
package com.example.lab_week_05

import com.squareup.moshi.Json

// This class models the data from thecatapi.com
data class ImageData(
    @Json(name = "url") val imageUrl: String
)