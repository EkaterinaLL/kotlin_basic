package org.example

import kotlin.math.roundToInt

fun main(args: Array<String>) {

}

open class Aircraft(val aircraftNumber: String, val maximumFlightRange: Int, val tankCapacity: Int) {
    val fuelConsumptionPer100Km: Int
        get() = (tankCapacity.toDouble() / maximumFlightRange * 100).roundToInt()

}

class Boeing747(aircraftNumber: String, maximumFlightRange: Int, tankCapacity: Int, val passengerCapacity: Int) :
    Aircraft(aircraftNumber, maximumFlightRange, tankCapacity)

