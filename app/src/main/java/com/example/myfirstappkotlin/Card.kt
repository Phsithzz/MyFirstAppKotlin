package com.example.myfirstappkotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myfirstappkotlin.model.Course

@Composable

fun CourseCard(course:Course, modifier:Modifier){
    Surface(shape = RoundedCornerShape(8.dp), shadowElevation = 8.dp,modifier=modifier) {
        Column {
            Image(
                painter = painterResource(course.image),
                contentDescription = "Description",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
            )

            Column(modifier = Modifier.padding(16.dp)){
                Text(course.title, style = MaterialTheme.typography.headlineSmall)
                for(ingredient in course.detail){
                    Text("$ingredient")
                }
            }
        }
    }
}