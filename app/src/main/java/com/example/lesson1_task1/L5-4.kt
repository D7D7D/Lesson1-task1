package com.example.lesson1_task1

fun main() {
    val baseName = "Zaphod"
    val basePass = "PanGalactic"

    var newUser = ""
    var newPass = ""

    var authentication = false

    while (authentication == false) {
        println("введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа")
        val name = readLine()!!
        val pass = readLine()!!

        if (baseName == name && basePass == pass || newUser == name && newPass == pass) {
            println("Ваши данные проверены, и о, чудо, они верны")
            authentication = true
        } else {
            println("Вас нет в базе данных, хотите зарегистрироваться? Вводите свои данные Имя и пароль")
            newUser = readLine()!!
            newPass = readLine()!!
        }
    }







}
