package com.brandon.data.repository.sample

import com.brandon.data.local.sample.database.ExampleDatabase
import com.brandon.data.mapper.sample.ExampleMapper.toDomain
import com.brandon.data.mapper.sample.ExampleMapper.toEntity
import com.brandon.data.network.sample.ExampleApiService
import com.brandon.domain.sample.model.Example
import com.brandon.domain.sample.repository.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val apiService: ExampleApiService,
    private val exampleDatabase: ExampleDatabase
) : ExampleRepository {
    override suspend fun getExamples(): List<Example> {
        val apiResponse = apiService.getExamples()
        val domainExamples = apiResponse.map { it.toDomain() }

        // Save to database
        exampleDatabase.exampleDao().insertAll(domainExamples.map { it.toEntity() })

        return domainExamples
    }
}