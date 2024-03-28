package org.example

import kotlin.math.sqrt

fun main(args: Array<String>) {
    exercise12()
}

fun exercise12() {
    println("Введите год:")
    var yearfoCheck = readln().toInt()
    leapСheck(yearfoCheck)
}

fun leapСheck(year: Int) {
    var leap = false
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false

    println(if (leap) "Год високостный" else "Год не високостный")
}

fun exercise13() {
    val names = arrayOf("Саша", "Маша", "Аня", "Вася")
    employeeСounting(*names)
}

fun employeeСounting(vararg names: String) {
    var quantity = 0
    for (name in names)
        quantity += 1
    println("Количество сотрудников: $quantity")
}

fun exercise14() {
    employeeInformation("Иванов Иван Иванович", "Инженер")
    employeeInformation("Иванов Иван Иванович", 30, "Инженер")
    employeeInformation("Иванов Иван Иванович", "женат", "Инженер")
    employeeInformation("Иванов Иван Иванович", 30, "женат", "Инженер")
}

fun employeeInformation(fullname: String, position: String) {
    println("$fullname\t$position")
}

fun employeeInformation(fullname: String, age: Int, position: String) {
    println("$fullname\t$age лет\t$position")
}

fun employeeInformation(fullname: String, familystatus: String, position: String) {
    println("$fullname\t$familystatus\t$position")
}

fun employeeInformation(fullname: String, age: Int, familystatus: String, position: String) {
    println("$fullname\t$age лет\t$familystatus\t$position")
}

fun exercise15() {
    val cityNames: Array<String> = arrayOf("Москва", "Питер", "Владивосток", "Иркутск")
    val printer = { array: Array<String> ->
        for (args in array) {
            println(args)
        }
    }
    printer(cityNames)
}

fun exercise16() {
    squareRoot(25.0)
}

fun squareRoot(x: Double) {
    val result = sqrt(x)
    println(result)
}
