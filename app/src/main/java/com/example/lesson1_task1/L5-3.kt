package com.example.lesson1_task1

fun main() {
    println("Испытай удачу в Казино, введи два числа:")
    val digit1 = readLine()!!.toInt()
    val digit2 = readLine()!!.toInt()

    val x = 12
    val  y = 76

    if (digit1 == x && digit2 == y) {
        println("Поздравляем Вы сорвали куш")
    } else if (digit1 == x || digit2 == y) {
        println("Немного не хватило, получите утешительный приз")
    } else {
        println("Your lose")
    }
}
