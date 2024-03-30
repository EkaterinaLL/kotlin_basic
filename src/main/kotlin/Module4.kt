package org.example

import kotlin.math.roundToInt

fun main(args: Array<String>) {

}

class Aircraft(val aircraftNumber: String, val maximumFlightRange: Int, val tankCapacity: Int) {
    val fuelConsumptionPer100Km: Int
        get() = (tankCapacity.toDouble() / maximumFlightRange * 100).roundToInt()

}

