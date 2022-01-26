import java.math.RoundingMode.FLOOR

fun main() {
    val power = readLine()!!.toInt()
    val mode = readLine()!!.toInt()
    val n = readLine()!!.toBigDecimal()

    val f = n.setScale(mode, FLOOR).pow(power)

    println(f)
}
