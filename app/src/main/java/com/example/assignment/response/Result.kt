package com.example.assignment.response

data class Result(
    val questions: List<Question>,
    val timeInMinutes: Int
)