package com.example.todoapp.android.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todoapp.data.TodoRepositoryImpl
import com.example.todoapp.domain.model.Todo

@Composable
fun MainScreen() {
    val todos: List<Todo> = TodoRepositoryImpl().getAllTodos()

    Scaffold(
        topBar = {
            TopAppBar() {
                Text("Todos")
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* ... */ }) {
                Icon(Icons.Filled.Add, contentDescription = "Localized description")
            }
        }
    ) {
        LazyColumn {
            items(todos) {
                TodoItem(todo = it)
            }
        }
    }
}

@Composable
fun TodoItem(todo: Todo) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(todo.description, style = MaterialTheme.typography.h3)
        Spacer(modifier = Modifier.padding(4.dp))
        Text(todo.text, style = MaterialTheme.typography.body1)
    }
}

@Preview
@Composable
fun PreviewMainScreen(){
    MainScreen()
}