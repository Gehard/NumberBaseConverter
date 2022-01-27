fun main() {
    val n = readLine()!!.toInt()
    
    if (n > -15 && n <= 12 || n > 14 && n < 17 || n >= 19) {
        println("True")
    } else {
        println("False")
    }
}
