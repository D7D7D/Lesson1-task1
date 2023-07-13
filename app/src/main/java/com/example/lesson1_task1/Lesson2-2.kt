package com.example.lesson1_task1
fun main() {
    val quantityWorkers = 50
    val mainSalary = 30000

    val quantityIntern = 30
    val secondSalary = 20000

    val sumMain = quantityWorkers * mainSalary
    val sumSecond = quantityIntern * secondSalary + sumMain

    val sum = sumSecond / (quantityWorkers + quantityIntern)

    println("Расходы на выплату зарплаты постоянных сотрудников: $sumMain")
    println("Общие расходы по ЗП после прихода стажеров: $sumSecond")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $sum")
}
