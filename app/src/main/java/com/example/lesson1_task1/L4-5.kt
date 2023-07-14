package com.example.lesson1_task1

fun main() {

    val damage = false
    val peoples = 70
    val scrab = 50
    val weather = true

    val damage1: Boolean = readLine().toBoolean()
    val peoples1: Int = readLine()!!.toInt()
    val scrab1: Int = readLine()!!.toInt()
    val weather1: Boolean = readLine().toBoolean()

    if (damage == damage1) {
        if ( peoples1 in 55..70 && scrab1 >= scrab && weather == weather1) {
            println("Можем плыть")
        } else {
            println("Нельзя отправляться")
        }
    } else {
        if ( peoples1 == peoples && scrab1 >= scrab && weather == weather1) {
            println("Можем плыть")
        } else {
            println("Нельзя отправляться")
        }
    }
}
