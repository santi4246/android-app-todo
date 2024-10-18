package com.example.todoapp

import java.time.Instant
import java.util.Date

data class Todo(
    var id : Int,
    var title : String,
    var createdAt: Date
)

fun getFakeTodo(): List<Todo>{
    return listOf<Todo>(
        Todo(id = 1, title = "First Todo", Date.from(Instant.now())),
        Todo(id = 2, title = "Second Todo", Date.from(Instant.now())),
        Todo(id = 3, title = "Third Todo", Date.from(Instant.now())),
        Todo(id = 4, title = "Fourth Todo", Date.from(Instant.now())),
    )
}