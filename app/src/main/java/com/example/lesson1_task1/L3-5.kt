package com.example.lesson1_task1

fun main() {
    val from = "D2"
    val inn = "D4"
    val num = 0

    //решение
    val resultString = "$from-$inn;$num"
    println(resultString)

    //сервер, распарсить

    val from1 = "$resultString".dropLast(5)
    val inn1 = "$resultString".dropLast(2).drop(3)
    val num1 = "$resultString".drop(6)

    println(from1)
    println(inn1)
    println(num1)
}
