package com.brandon.data.local.sample.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.brandon.data.local.sample.model.ExampleEntity

@Dao
interface ExampleDao {
    @Query("SELECT * FROM examples")
    suspend fun getAllExamples(): List<ExampleEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(examples: List<ExampleEntity>)
}