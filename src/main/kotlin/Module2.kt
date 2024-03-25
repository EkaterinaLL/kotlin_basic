package org.example

import kotlin.time.times

fun main(args: Array<String>) {
    exercise7()
}

fun exercise7() {
    val test = "Начало тестирования. Введите ответ английскими буквами и нажмите Enter.\n"
    println(test)

    var userResult: Int = 0
    val test1: String = """
        Кто написал роман "Мастер и Маргарита"?
        a)Михаил Булгаков
        b)Фёдор Достоевский
        c)Антон Чехов
        Ответ:""".trimIndent()
    println(test1)
    val correctAnswer1 = "a"
    val userAnswer1 = readLine()
    if (userAnswer1 == correctAnswer1) {
        userResult = userResult + 1
    }

    val test2: String = """
        Кто написал повесть "Палата № 6"?
        a)Михаил Булгаков
        b)Фёдор Достоевский
        c)Антон Чехов
        Ответ:""".trimIndent()
    println(test2)
    val correctAnswer2 = "c"
    val userAnswer2 = readLine()
    if (userAnswer2 == correctAnswer2) {
        userResult = userResult + 1
    }

    val test3: String = """
        Кто написал роман "Преступление и наказание"?
        a)Михаил Булгаков
        b)Фёдор Достоевский
        c)Антон Чехов
        Ответ:""".trimIndent()
    println(test3)
    val correctAnswer3 = "b"
    val userAnswer3 = readLine()
    if (userAnswer3 == correctAnswer3) {
        userResult = userResult + 1
    }

    val test4: String = """
        Кто написал поэму "Мертвые души"?
        a)Михаил Булгаков
        b)Николай Гоголь
        c)Михаил Лермонтов
        Ответ:""".trimIndent()
    println(test4)
    val correctAnswer4 = "b"
    val userAnswer4 = readLine()
    if (userAnswer4 == correctAnswer4) {
        userResult = userResult + 1
    }

    val test5: String = """
        Кто написал роман "Герой нашего времени"?
        a)Михаил Булгаков
        b)Николай Гоголь
        c)Михаил Лермонтов
        Ответ:""".trimIndent()
    println(test5)
    val correctAnswer5 = "c"
    val userAnswer5 = readLine()
    if (userAnswer5 == correctAnswer5) {
        userResult = userResult + 1
    }

    when (userResult) {
        5 -> println("Результат: Отличные знания в литературе!(5 из 5)")
        4 -> println("Результат: Хороший результат(4 из 5)")
        3 -> println("Результат: Стоит подтянуть знания (3 из 5)")
        2 -> println("Результат: Знания на двоечку (2 из 5)")
        1 -> println("Результат: Есть небольшой потенциал (1 из 5)")
        0 -> println("Результат: Литература это не ваше (0 из 5)")
    }
}

fun exercise8() {
    val startingMessage = "Расчет дохода по вкладу.\n"
    println(startingMessage)

    val depositAmountHeader: String = "Введите сумму вклада:"
    println(depositAmountHeader)
    val depositAmountString: String? = readLine()
    val depositAmountInt = depositAmountString?.toDouble()

    val numberOfMonthsHeader: String = "Введите длительность депозита (количесво месяцев):"
    println(numberOfMonthsHeader)
    val numberOfMonthsString: String? = readLine()
    val numberOfMonthsInt = numberOfMonthsString?.toInt()

    val monthlyInterestOnDepositHeader: String = "Введите ежемесячный процент по депозиту:"
    println(monthlyInterestOnDepositHeader)
    val monthlyInterestOnDepositString: String? = readLine()
    val monthlyInterestOnDepositDouble = monthlyInterestOnDepositString?.toDouble()
    val monthlyInterestOnDepositPercent = monthlyInterestOnDepositDouble!! * 0.01

    var monthlyDepositIncome: Double
    var monthlyTotal: Double = depositAmountInt!!

    var monthCounter: Int = 0
    if (numberOfMonthsInt!! > 0) {
        do {
            monthCounter = monthCounter + 1
            monthlyDepositIncome = monthlyTotal * monthlyInterestOnDepositPercent
            monthlyTotal = monthlyTotal + monthlyDepositIncome
            println("\nМесяц " + monthCounter + "\nМесячная прибыль = " + monthlyDepositIncome + "\nСумма вклада в месяце = " + monthlyTotal)
        } while (monthCounter < numberOfMonthsInt)
    } else return
}

fun exercise9() {
    val table: Array<Array<String>> = Array(3, { Array(3, { "Значение" }) })
    table[0] = arrayOf("Россия", "Москва", "Рубли")
    table[1] = arrayOf("Япония", "Токио", "Иена")
    table[2] = arrayOf("Италия", "Рим", "Евро")
    println(table[0])
    for (row in table) {
        for (cell in row) {
            print("$cell \t")
        }
        println()
    }
}

fun exercise10() {
    var cityNames: ArrayList<String> = arrayListOf("Москва", "Санкт-Петербург", "Владивосток", "Владивосток")

    val addСity: String = "добавить город"
    val displayAllCities: String = "вывести все города"
    val displayUniqueCities: String = "вывести уникальные города"
    val exitTheProgram: String = "выйти"

    do {
        val textForUser: String = """
        
        Это программа для хранения городов. 
        Введите одно из действий: "добавить город","вывести все города", "вывести уникальные города", "выйти"""".trimIndent()
        println(textForUser)
        var userChoice: String? = readLine()

        if (userChoice == addСity) {
            val textForAddCity: String = "Введите название города"
            println(textForAddCity)
            var enteredCity: String? = readLine()
            cityNames.add(enteredCity!!)
        } else if (userChoice == displayAllCities) {
            println(cityNames)
        } else if (userChoice == displayUniqueCities) {
            println(cityNames.distinct())
        } else if (userChoice == exitTheProgram) {
            println("Выход из программы")
            return
        } else {
            println("Ошибка выбора действия")
        }
    } while (userChoice != exitTheProgram)
}

fun exercise11() {
    val employeePlaces: Map<Int, String> = mapOf (1 to "Иванов Иван Иванович", 2 to "Петров Петр Петрович", 3 to "Семенов Семен Семенович")
    val programText: String = "Введите номер места:"
    println(programText)
    val userChoiceString: String? = readlnOrNull()
    val userChoiceInt = userChoiceString?.toInt()

    if (employeePlaces.containsKey(userChoiceInt)){
        println("Место занимает: " + employeePlaces[userChoiceInt])
    } else {
        println("Рабочее место не занято")
    }
}