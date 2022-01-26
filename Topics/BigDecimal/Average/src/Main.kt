import java.math.RoundingMode.DOWN

const val THREE = 3

fun main() {
    val a = readLine()!!.toBigDecimal()
    val b = readLine()!!.toBigDecimal()
    val c = readLine()!!.toBigDecimal()

    val average = (a + b + c) / THREE.toBigDecimal()

    println(average.setScale(0, DOWN))
}
