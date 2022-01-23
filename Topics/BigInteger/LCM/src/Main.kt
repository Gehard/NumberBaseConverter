fun main() {
    val a = readLine()!!.toBigInteger()
    val b = readLine()!!.toBigInteger()

    val lcd = a * b / a.gcd(b)
    println(lcd)
}