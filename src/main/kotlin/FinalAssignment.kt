package org.example

fun main(args: Array<String>) {
    val B747: Aircraft = Boeing747("N123MC", 12000, 11000, 180)
    val B7471: Aircraft = Boeing747("N567MC", 11000, 10000, 160)
    val An225: Aircraft = An225("G-PKR", 14000, 12500, 88, 156.3)
    val A320: Aircraft = AirbusA320("C-RCMP", 15000, 13500, 250)
    val Tu154: Aircraft = Tu154("C6-SEA", 10000, 9000, 150)

    val listOfAircraft = arrayListOf(B747, B7471, An225, A320, Tu154)

    val getListOfAircraft = "1" // вариант выбора для пользовталя - получить список самолетов
    val exitTheProgram: String = "2" // вариант выбора для пользовталя - выйти из программы

    do {
        val textForUser: String = """
        
            Информация о самолетах авикомпании. 
            Введите цифру для выполнения действия: "1 - вывести список самолетов", "2 - выйти"""".trimIndent()
        println(textForUser)
        val userChoice: String? = readlnOrNull()
        if (userChoice == getListOfAircraft) {
            val textForUser2: String = """
        
                Выберите самолет из списка. 
                Введите цифру для получения информации о самолете:"""".trimIndent()
            println(textForUser2)
            for ((index, aircraft) in listOfAircraft.withIndex()) {
                println("${index + 1} - ${aircraft.getShortInfo()}")
            }
            val userChoice2: Int = readlnOrNull().toString().toInt()
            listOfAircraft[userChoice2 - 1].printAircraftCharacteristics()

        }
    } while (userChoice != exitTheProgram)


}

class An225(
    aircraftNumber: String,
    maximumFlightRange: Int,
    tankCapacity: Int,
    override val passengerCapacity: Int,
    override val liftingCapacity: Double
) :
    Aircraft(aircraftNumber, maximumFlightRange, tankCapacity), Passenger, Cargo {
    override fun printAircraftCharacteristics() {
        println(
            """
            Номер воздушного судна: $aircraftNumber
            Максимальная дальность полета: $maximumFlightRange км
            Вместимость бака: $tankCapacity л
            Расход топлива на 100 км:  $fuelConsumptionPer100Km на км
            Вместимость пассажиров: $passengerCapacity человек
            Грузоподёмность воздушного судна: $liftingCapacity тонн
            """.trimIndent()
        )
    }

    override fun getModel(): String {
        return "An225"
    }
}

interface Cargo {
    val liftingCapacity: Double
}

class AirbusA320(
    aircraftNumber: String,
    maximumFlightRange: Int,
    tankCapacity: Int,
    override val passengerCapacity: Int,
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
        return "AirbusA320"
    }
}

class Tu154(
    aircraftNumber: String,
    maximumFlightRange: Int,
    tankCapacity: Int,
    override val passengerCapacity: Int,
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
        return "Tu154"
    }
}
