package com.example.lesson1_task1

fun main() {

    var vklad = 70000.0
    val procent =  1.167


    //решение

    var result = 0.0

    for (i in 1..20) {
        result = vklad * procent
        vklad = result
    }

    println(String.format("%.3f", result))

}
