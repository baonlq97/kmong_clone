package com.brandon.domain.sample.usecases

import com.brandon.domain.sample.repository.ExampleRepository
import javax.inject.Inject

class GetExamplesUseCase @Inject constructor(
    private val repository: ExampleRepository
) {
    suspend operator fun invoke() = repository.getExamples()
}