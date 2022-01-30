import java.util.Collections
fun main() {
    val numberList = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()

    print(Collections.frequency(numberList, m))
}