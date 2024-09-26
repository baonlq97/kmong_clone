package com.brandon.domain.sample.repository

import com.brandon.domain.sample.model.Example

interface ExampleRepository {
    suspend fun getExamples(): List<Example>
}