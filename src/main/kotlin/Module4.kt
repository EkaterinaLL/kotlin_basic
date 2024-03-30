package org.example

import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val car: Cars = Cars("BMW", "blue", "12345BMW")
    println(car.toString())
}

data class Cars(var carModel: String, var carColor: String, var carNumber: String){
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
            Максимальная дальность полета: $maximumFlightRange
            Вместимость бака: $tankCapacity
            Расход топлива на 100 км:  $fuelConsumptionPer100Km
            """
        )
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
            Максимальная дальность полета: $maximumFlightRange
            Вместимость бака: $tankCapacity
            Расход топлива на 100 км:  $fuelConsumptionPer100Km
            Вместимость пассажиров: $passengerCapacity
            """
        )
    }
}

interface Passenger {
    val passengerCapacity: Int
}