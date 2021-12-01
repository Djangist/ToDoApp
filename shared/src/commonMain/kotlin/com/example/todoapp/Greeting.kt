package com.example.todoapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}