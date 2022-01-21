import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

const val COEFFICIENTS = 3
const val FOUR = 4

fun main() {
    val (a, b, c) = List(COEFFICIENTS) { readLine()!!.toDouble() }
    val x1 = (-b - sqrt(b.pow(2) - FOUR * a * c)) / (2 * a)
    val x2 = (-b + sqrt(b.pow(2) - FOUR * a * c)) / (2 * a)
    println("${min(x1, x2)} ${max(x1, x2)}")
}
