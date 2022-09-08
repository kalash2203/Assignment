package com.example.assignment.network

import com.example.assignment.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {
    private var apiClient: ApiClient? = null
    private var retrofit: Retrofit? = null

    init {
        retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Synchronized
    fun getApiClient() : ApiClient {
        if (apiClient == null) {
            apiClient = ApiClient
        }
        return apiClient as ApiClient
    }

    fun getApi(): Apis {
        return retrofit!!.create(Apis::class.java)
    }
}