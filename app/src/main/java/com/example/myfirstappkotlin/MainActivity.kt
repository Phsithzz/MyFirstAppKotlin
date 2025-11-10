package com.example.myfirstappkotlin
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstappkotlin.model.Course
import com.example.myfirstappkotlin.ui.theme.MyFirstAppKotlinTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.Alignment

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstAppKotlinTheme {

                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Row(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically) {
                                    Image(
                                        painter = painterResource(R.drawable.logo),
                                        contentDescription = "Logo",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .width(100.dp)
                                            .height(100.dp)
                                    )
                                    Text(
                                        text = "My Courses",
                                        modifier = Modifier.padding(start = 8.dp)
                                    )
                                }
                            },
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primary,
                                titleContentColor = MaterialTheme.colorScheme.onPrimary
                            )
                        )
                    }
                ) { paddingValues ->

                    Column(
                        modifier = Modifier
                            .padding(paddingValues)
                            .fillMaxSize()
                    ) {
                        val dummyData = arrayListOf<Course>()
                        val dummyDetail = arrayListOf("111","222","333")
                        dummyData.add(Course(title ="HTML Course",image=R.drawable.banner1,detail=dummyDetail))
                        dummyData.add(Course(title =".NET Course",image=R.drawable.banner1,detail=dummyDetail))
                        dummyData.add(Course(title ="CSS Course",image=R.drawable.banner1,detail=dummyDetail))
                        dummyData.add(Course(title ="React Course",image=R.drawable.banner1,detail=dummyDetail))
                        dummyData.add(Course(title ="Android Course",image=R.drawable.banner1,detail=dummyDetail))

                        MyList(dummyData)
                    }
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstAppKotlinTheme {
        Greeting("Android")
    }
}