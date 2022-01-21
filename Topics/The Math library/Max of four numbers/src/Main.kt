const val SIZE = 4

fun main() {
    val list = mutableListOf<Int>()

    for (i in 1..SIZE) {
        val n = readLine()!!.toInt()
        list.add(n)
    }

    println(list.maxOrNull())
}