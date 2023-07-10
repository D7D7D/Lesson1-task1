package com.example.lesson1_task1

fun main() {
    val startTimeHours = 9
    val startTimeMinutes = 39   //минуты

    val travelTime = 457   //минуты

    //вычисляем:

    // парсим время отправления
    val startTime = startTimeHours * 60 + startTimeMinutes
    //println(startTime)

    val sum = startTime + travelTime  //общее время

    //  парсим время прибытия
    val travelHours = sum/60
    val travelMinutes = sum%60
    println("Время прибытия - ${travelHours.toString()+':'+travelMinutes.toString()}")
}
