import java.util.Collections.rotate

fun main() {
    val list = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val distance = readLine()!!.toInt()
    rotate(list, distance)
    println(list.joinToString(" "))
}