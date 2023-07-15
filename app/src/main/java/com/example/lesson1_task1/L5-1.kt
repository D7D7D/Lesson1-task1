package com.example.lesson1_task1


fun main(){
    val baseName = "Dima"
    val basePassword = "12345"

    println("Введите Имя и пароль")

    val name = readLine()
    val password = readLine()

    if (name == baseName && password == basePassword) {
        println("Добро пожаловать!")
    } else {
        println("В доступе отказано")
    }
}
