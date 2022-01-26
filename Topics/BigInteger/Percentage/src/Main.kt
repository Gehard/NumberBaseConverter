const val ONE_HUNDRED = 100

fun main() {
    val a = readLine()!!.toBigInteger()
    val b = readLine()!!.toBigInteger()

    val sum = a + b

    val percentageA = a * ONE_HUNDRED.toBigInteger() / sum
    val percentageB = b * ONE_HUNDRED.toBigInteger() / sum

    println("${percentageA.toInt()}% ${percentageB.toInt()}%")
}
