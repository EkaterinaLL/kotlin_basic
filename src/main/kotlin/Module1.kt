package org.example

fun main(args: Array<String>) {
    exercise1()
}

fun exercise1() {
    var a: Any? = null
    a = 5
    val b = a / 2.5
    // Переменная b имеет тип данных Double
}

fun exercise2() {
    val c: String = "hello"
    val d: String = " aplana"
    println(c + d)
}

fun exercise3(args: Array<String>) {
    val five: Char = '5'
    five.toString()
    five.code.toByte() //вместо toByte()
    five.code.toShort() //вместо toShort()
    five.code //вместо toInt()
    five.code.toDouble() //вместо toDouble()
    five.code.toFloat() //вместо toFloat()
    five.code.toLong() //вместо toLong()
}

fun exercise4() {
    println("Введите ваше имя и нажмите Enter")
    val userText: String? = readLine()
    val userName: String = userText.toString()
    println("Привет, $userName!")
}

fun exercise5() {
    val range = 'z' downTo 'a'
}

fun exercise6() {
    println("Введите значение перемнной a и нажмите Enter")
    val userText1: String? = readLine()
    val aString = userText1.toString()
    val aInt = aString.toInt()
    println("Введите значение перемнной b и нажмите Enter")
    val userText2: String? = readLine()
    val bString = userText2.toString()
    val bInt = bString.toInt()
    val c = aInt > bInt
    println("Больше ли a, чем b: $c")
}
