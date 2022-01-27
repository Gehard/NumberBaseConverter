fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    when {
        a >= b && a >= c -> println(a)
        b >= a && b >= c -> println(b)
        else -> println(c)
    }
}
