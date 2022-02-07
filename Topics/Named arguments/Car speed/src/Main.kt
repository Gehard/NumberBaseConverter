const val LIMIT = 60

fun checkLimit(speed: Int, limit: Int = LIMIT) =
    if (speed > limit) "Exceeds the limit by ${speed - limit} kilometers per hour" else "Within the limit"

fun main(args: Array<String>) {
    val speed = readLine()!!.toInt()
    val limit = readLine()!!.toIntOrNull()

    println(if (limit == null) checkLimit(speed) else checkLimit(speed, limit))
}