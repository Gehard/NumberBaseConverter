fun main() {
    val n = readLine()!!.toInt()
    if (n < 0) {
        println("negative")
    } else if (n > 0) {
        println("positive")
    } else {
        println("zero")
    }
}
