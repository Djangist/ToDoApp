package com.example.todoapp.domain.repository

import com.example.todoapp.domain.model.Todo

interface TodoRepository {
    fun getAllTodos(): List<Todo>
}