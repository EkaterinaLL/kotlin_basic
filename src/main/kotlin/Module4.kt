package org.example

import kotlin.math.roundToInt

fun main(args: Array<String>) {

}

class Aircraft {
    var aircraftNumber: String = "В745"
    var maximumFlightRange: Int = 13000
    var tankCapacity: Int = 12000
    val fuelConsumptionPer100Km: Int
        get() = (tankCapacity.toDouble() / maximumFlightRange * 100).roundToInt()

}

