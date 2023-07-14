package com.example.lesson1_task1

fun main() {

    val day = 9
    val train1 = "руки-пресс"
    val train2 = "ноги-спина"

    val result = day%2
    println(result)

    if (1 == result) {
        println("Сегодня упражнения на:$train1")
    } else println("Сегодня упражнения на:$train2")

    var trainHands = false
    var trainLegs = false
    var trainSpine = false
    var trainPress = false

    if (1 == result) {
        trainHands = true
        trainPress = true
    } else {
        trainLegs = true
        trainSpine = true
    }

    println(""""Упражнения для рук:$trainHands
 Упражнения для ног:$trainLegs
 Упражнения для спины:$trainSpine
 Упражнения для пресса:$trainPress""".trimIndent())

}
