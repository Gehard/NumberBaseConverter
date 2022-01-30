import java.util.Collections

fun main() {
    val num = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }

    Collections.rotate(num, +1)
    print(num.joinToString().replace(",", ""))
}