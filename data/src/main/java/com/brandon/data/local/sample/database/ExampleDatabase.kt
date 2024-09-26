package com.brandon.data.local.sample.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.brandon.data.local.sample.dao.ExampleDao
import com.brandon.data.local.sample.model.ExampleEntity

@Database(entities = [ExampleEntity::class], version = 1)
abstract class ExampleDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}