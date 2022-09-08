package com.example.assignment.response

data class Question(
    val correct_answers: List<Int>,
    val lable: String,
    val options: List<Option>
)