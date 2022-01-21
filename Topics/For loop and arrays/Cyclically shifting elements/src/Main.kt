import java.util.Collections.rotate

fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size).toMutableList()

    for (i in 0 until size) {
        array[i] = readLine()!!.toInt()
    }
    val list = array.toList()
    rotate(list, 1)
    println(list.toIntArray().joinToString(" "))
}