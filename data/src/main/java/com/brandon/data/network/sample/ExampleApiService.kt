package com.brandon.data.network.sample

import com.brandon.data.network.sample.model.ExampleResponse
import retrofit2.http.GET

interface ExampleApiService {
    @GET("examples")
    suspend fun getExamples(): List<ExampleResponse>
}