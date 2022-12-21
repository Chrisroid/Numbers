package com.auto.numbers

import retrofit2.http.GET

interface ApiInterface {
        @GET("/numbers")
        suspend fun getNumbers(): List<Numbers>
    }
