fun main() {
    val year = readLine()!!.toInt()
    if (year in 1900..3000 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
        println("Leap")
    } else {
        println("Regular")
    }

}
