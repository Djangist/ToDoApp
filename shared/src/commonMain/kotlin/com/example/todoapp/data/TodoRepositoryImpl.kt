package com.example.todoapp.data

import com.example.todoapp.domain.model.Todo
import com.example.todoapp.domain.repository.TodoRepository

class TodoRepositoryImpl : TodoRepository {
    override fun getAllTodos(): List<Todo> = listOf(
        Todo(description = "test", text = "Lorem ipsum lorem ipsum", "12-12-2021"),
        Todo(description = "test 1", text = "Lorem ipsum lorem ipsum", "12-12-2021"),
        Todo(description = "test 2", text = "Lorem ipsum lorem ipsum", "12-13-2021"),
        Todo(description = "test 3", text = "Lorem ipsum lorem ipsum", "12-14-2021"),
        Todo(description = "test 4", text = "Lorem ipsum lorem ipsum", "12-15-2021"),
        Todo(description = "test 5", text = "Lorem ipsum lorem ipsum", "12-15-2021"),
    )
}