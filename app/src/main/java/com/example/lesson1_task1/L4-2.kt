package com.example.lesson1_task1

fun main() {
    val weightMax = 100
    val weightMin = 35
    val volume = 100

    val cargoWeight = 42
    val cargoVolume = 120

    println(cargoWeight >= weightMin && cargoWeight <= weightMax && cargoVolume <= volume)
}
