package com.example.assignment.network

import com.example.assignment.response.QuizResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface Apis {

    @GET("b4e7d359-c58f-4aa3-a314-726b3baa3852.mock.pstmn.io/")

    fun getQuiz(
        @Query("quiz")  Quiz:String
    ): Call<QuizResponse>
}