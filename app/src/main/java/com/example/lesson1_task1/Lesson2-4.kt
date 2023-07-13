package com.example.lesson1_task1

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val buff = 20

    //вычисляем
    val withbuff1 = crystallineOre * buff /100
    val withbuff2 = ironOre * buff /100

    println("Кристалическая руда с учетом бонуса: $withbuff1")
    println("Железная руда с учетом бонуса: $withbuff2")
}
