package com.example.composerecyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.unit.dp
import com.example.composerecyclerview.Model.Person
import com.example.composerecyclerview.Repository.PersonRepository
import com.example.composerecyclerview.ui.theme.ComposeRecyclerViewTheme
import com.example.composerecyclerview.ui.theme.CustomItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                ComposeRecyclerViewTheme {

                    val personRepository = PersonRepository()
                    val getAllData = personRepository.getAllData()

                    LazyColumn(contentPadding = PaddingValues(12.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)){
                         items(items = getAllData){
                             Person -> CustomItem(person = Person)
                         }
                    }

                }
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeRecyclerViewTheme {
    }
}