package com.example.myfirstappkotlin.model

import androidx.annotation.DrawableRes

data class Course(
    @DrawableRes val image: Int,
    val title: String,
    val detail: List<String>
)
