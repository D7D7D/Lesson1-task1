package com.example.lesson1_task1

fun main() {
    val secondsInSpase = 5409
    val minutesInSpase = secondsInSpase/60
    val minutesInSpaseresidue = secondsInSpase%60

    val hoursInSpase = minutesInSpase/60
    val hoursInSpaseresidue = minutesInSpase%60

    //println(minutesInSpase)
    //println(minutesInSpaseresidue)

    //println(hoursInSpase)
    //println(hoursInSpaseresidue)

println("Время в космосе - ${'0'+hoursInSpase.toString()+':'+hoursInSpaseresidue.toString()+':'+'0'+minutesInSpaseresidue.toString()}")
}
