package com.example

import com.example.db.TaskTable
import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun Application.configureDatabases() {
    Database.connect(
        "jdbc:postgresql://localhost:5432/mydb",
        user = "postgres",
        password = "chaitnya_7679"
    )
    transaction {
        SchemaUtils.create(TaskTable)
    }
    println("Connected to database and ensured TaskTable exists")
}
