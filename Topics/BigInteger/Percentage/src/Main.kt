fun main() {
    val a = readLine()!!.toBigInteger()
    val b = readLine()!!.toBigInteger()

    val sum = a + b
    val percA = (a * 100.toBigInteger()).div(sum)
    val percB = (b * 100.toBigInteger()).div(sum)

    println("$percA% $percB%")
}