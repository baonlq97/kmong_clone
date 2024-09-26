package com.brandon.kmongclone.di

import android.content.Context
import androidx.room.Room
import com.brandon.data.local.sample.database.ExampleDatabase
import com.brandon.data.network.sample.ExampleApiService
import com.brandon.data.repository.sample.ExampleRepositoryImpl
import com.brandon.domain.sample.repository.ExampleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApiService(): ExampleApiService {
        return Retrofit.Builder()
            .baseUrl("https://api.example.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ExampleApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): ExampleDatabase {
        return Room.databaseBuilder(
            context,
            ExampleDatabase::class.java,
            "example_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideExampleRepository(apiService: ExampleApiService, appDatabase: ExampleDatabase): ExampleRepository {
        return ExampleRepositoryImpl(apiService, appDatabase)
    }
}