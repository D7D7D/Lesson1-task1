package com.example.lesson1_task1

fun main() {
    val year = 2023
    val oldLimit = 18

    println("Введите год Вашего рождения в формате ХХХХ:")
    val userYear = readLine()!!.toInt()
    val userOld = year - userYear

    if (userOld >= oldLimit) {
        println("Доступ к 18+ разрешен")
    } else {
        println("Просмотр запрещен законом")
    }
}
