package aykuttasil.com.playgrounddagger.di.modules

import aykuttasil.com.playgrounddagger.data.remote.ApiManager
import aykuttasil.com.playgrounddagger.data.remote.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by aykutasil on 27.11.2017.
 */


@Module
class ApiManagerModule {

    private val apiService: ApiService

    init {
        val baseUrl = "https://api.github.com/"
        val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        apiService = retrofit.create(ApiService::class.java)
    }

    @Provides
    fun provideApiService(): ApiService {
        return this.apiService
    }

    @Provides
    fun provideApiManager(): ApiManager {
        return ApiManager(this.apiService)
    }

}
