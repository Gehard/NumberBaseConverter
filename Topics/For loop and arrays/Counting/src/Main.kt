fun main() {
    val array = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()

    println(array.count { m == it })
}
