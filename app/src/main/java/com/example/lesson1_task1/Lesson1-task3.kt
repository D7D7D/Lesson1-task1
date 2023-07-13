package com.example.lesson1_task1

fun main() {
    val year: Int = 1961
    var hour: String = "09"
    var minute: String = "07"

    println(
        "Год первого полета в космос: $year, " +
                "Время пуска ракеты${hour+':'+minute} по московскому времени."
    )
    hour = "10"
    minute = "55"

    println(
        "Время приземления${hour+':'+minute} по московскому времени."
    )
}
