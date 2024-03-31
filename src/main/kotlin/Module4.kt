package org.example

import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val car: Cars = Cars("BMW", "blue", "12345BMW")
    println(car.toString())
}

data class Cars(var carModel: String, var carColor: String, var carNumber: String) {
    override fun toString(): String {
        return "Модель автомобиля: $carModel, Цвет: $carColor, Номер: $carNumber"
    }
}

abstract class Aircraft(
    protected val aircraftNumber: String,
    protected val maximumFlightRange: Int,
    protected val tankCapacity: Int
) {
    protected val fuelConsumptionPer100Km: Int
        get() = (tankCapacity.toDouble() / maximumFlightRange * 100).roundToInt()

    open fun printAircraftCharacteristics() {
        println(
            """
            Номер воздушного судна: $aircraftNumber
            Максимальная дальность полета: $maximumFlightRange км
            Вместимость бака: $tankCapacity л
            Расход топлива на 100 км:  $fuelConsumptionPer100Km на км
            """.trimIndent()
        )
    }

    protected abstract fun getModel(): String

    fun getShortInfo(): String {
        return "${getModel()} $aircraftNumber"
    }
}

class Boeing747(
    aircraftNumber: String,
    maximumFlightRange: Int,
    tankCapacity: Int,
    override val passengerCapacity: Int
) :
    Aircraft(aircraftNumber, maximumFlightRange, tankCapacity), Passenger {
    override fun printAircraftCharacteristics() {
        println(
            """
            Номер воздушного судна: $aircraftNumber
            Максимальная дальность полета: $maximumFlightRange км
            Вместимость бака: $tankCapacity л
            Расход топлива на 100 км:  $fuelConsumptionPer100Km на км
            Вместимость пассажиров: $passengerCapacity человек
            """.trimIndent()
        )
    }

    override fun getModel(): String {
        return "Boeing747"
    }
}

interface Passenger {
    val passengerCapacity: Int
}