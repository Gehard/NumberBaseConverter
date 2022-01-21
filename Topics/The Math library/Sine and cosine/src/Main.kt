import kotlin.math.cos
import kotlin.math.sin

fun main() {
    val radian = readLine()!!.toDouble()

    val difference = sin(radian) - cos(radian)

    println(difference)
}