package com.brandon.data.local.sample.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "examples")
data class ExampleEntity(
    @PrimaryKey val id: Int,
    val name: String
)