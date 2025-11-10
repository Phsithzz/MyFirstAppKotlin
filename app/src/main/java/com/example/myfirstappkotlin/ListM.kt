package com.example.myfirstappkotlin

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.myfirstappkotlin.model.Course
import androidx.compose.ui.Modifier

@Composable
fun MyList(courses:List<Course>){

    LazyColumn{
        items(courses){

            CourseCard(course = it,modifier = Modifier.padding(10.dp))
        }
    }
}