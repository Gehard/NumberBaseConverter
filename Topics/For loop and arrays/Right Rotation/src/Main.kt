import java.util.*

fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size).toMutableList()

    for (i in 0 until size) {
        array[i] = readLine()!!.toInt()
    }
    val list = array.toList()
    val distance = readLine()!!.toInt()
    Collections.rotate(list, distance)
    println(list.toIntArray().joinToString(" "))
}