package com.example.lesson1_task1

fun main() {
    val x = (1..10).random()
    val  y = (1..10).random()

    var win = false

    while (win == false) {
        println("Испытай удачу в Казино, введи два числа:")
        val digit1 = readLine()!!.toInt()
        val digit2 = readLine()!!.toInt()

        if (digit1 == x && digit2 == y || digit1 == y && digit2 == x)
        {
            println("Поздравляем Вы сорвали куш")
            win = true
        } else if (digit1 == x || digit2 == y) {
            println("Немного не хватило, получите утешительный приз")
            win = true
        } else {
            println("Your lose")
        }
    }
    println("Загаданные числа: $x, $y")
}
