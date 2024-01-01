fun main(){
    val firstNumber = 10
    val secondNumber = 10
    val thirdNumber = 30

    val result = add(firstNumber, secondNumber)
    val anotheResault = subtract(thirdNumber, result)

    println("The result is $resault")
    println("The result is $anotheResault")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}
fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}



fun main() {
    val firstUserEmailId = "user_one@gmail.com"
    
    // The following line of code assumes that you named your parameter as emailId. 
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(emailId = secondUserOperatingSystem, operatingSystem = secondUserEmailId))
    

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(emailId = thirdUserOperatingSystem, operatingSystem =  thirdUserEmailId))

}

fun displayAlertMessage(emailId: String, operatingSystem: String = "UnkownOs"): String {
    return "The email Id of the user is $emailId and the operating system is $operatingSystem"
}




fun screenTime(timeSpentToday: Int, timeSpentYesterday: Int ) : Boolean {
    if (timeSpentToday > timeSpentYesterday) {
        return true
    } else {
        return false
    }

}


fun main() {
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
    println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
    println("Have I spent more time using my phone today: ${compareTime(200, 220)}")
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}



fun main() {
    val timeSpentToday = 100
    val timeSpentYesterday = 50
    println(screenTime(timeSpentToday, timeSpentYesterday))
}

fun main(){
    println(weatherInfo(City = "Mumbai", LowTemp = 27, HighTemp = 30, ChancesOfRain = 0.7))
    println(weatherInfo(City = "Bangalore", LowTemp = 17, HighTemp = 20, ChancesOfRain = 0.2))
    println(weatherInfo(City = "Chennai", LowTemp = 25, HighTemp = 28, ChancesOfRain = 0.8))
}
fun  weatherInfo(City: String, LowTemp: Int, HighTemp: Int, ChancesOfRain: Double): String {
    return "The weather in $City today will be between $LowTemp and $HighTemp with a $ChancesOfRain chance of rain."
}

fun printWeatherInfo(City: String, LowTemp: Int, HighTemp: Int, ChancesOfRain: Double) {
    println("City: $City")
    println("Low Temp: $LowTemp")
    println("High Temp: $HighTemp")
    println("Chances of Rain: $ChancesOfRain")
    println()
}

fun main(){
    printWeatherInfo("Mumbai", 27, 30, 0.7)
    printWeatherInfo("Bangalore", 17, 20, 0.2)
    printWeatherInfo("Chennai", 25, 28, 0.8)
}