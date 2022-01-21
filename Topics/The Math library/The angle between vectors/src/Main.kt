import kotlin.math.PI
import kotlin.math.acos
import kotlin.math.hypot

const val RAD_TO_DEG = 180.0 / PI

fun main() {
    val (u, v) = List(2) { readLine()!!.split(" ").map { it.toDouble() } }
    val angle = acos((u[0] * v[0] + u[1] * v[1]) / (hypot(u[0], u[1]) * hypot(v[0], v[1]))) * RAD_TO_DEG
    println(angle)
}