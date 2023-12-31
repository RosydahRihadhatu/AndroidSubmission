package com.rosy.github.model

import com.rosy.github.model.User
import com.squareup.moshi.Json

data class SearchResponse(
    @field:Json(name = "items")
    val items: List<User>
)
