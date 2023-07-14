package com.example.lesson1_task1

fun main(){
    val tablefreeTomorrow = 4
    val tablefreeNow = 0


    if (tablefreeNow == 0) {
        println("Мест нет")
    } else {
        println("Сегодня свободно столиков:$tablefreeNow")
        }

    if (tablefreeTomorrow == 0) {
        println("Мест нет")
    } else {
        println("Завтра свободно столиков:$tablefreeTomorrow")
        }
}
