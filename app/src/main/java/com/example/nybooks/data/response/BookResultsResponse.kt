package com.example.nybooks.data.response

import com.squareup.moshi.Json

data class BookResultsResponse(
    @Json(name = "")
    val bookDetailResponses: List <BookDetailsResponse>
)