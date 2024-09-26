package com.brandon.data.mapper.sample

import com.brandon.data.local.sample.model.ExampleEntity
import com.brandon.data.network.sample.model.ExampleResponse
import com.brandon.domain.sample.model.Example

object ExampleMapper {
    fun ExampleResponse.toDomain(): Example {
        return Example(
            id = id,
            name = name
            // Map other fields as necessary
        )
    }

    fun ExampleEntity.toDomain(): Example {
        return Example(
            id = id,
            name = name
            // Map other fields as necessary
        )
    }

    fun Example.toEntity(): ExampleEntity {
        return ExampleEntity(
            id = id,
            name = name
            // Map other fields as necessary
        )
    }
}