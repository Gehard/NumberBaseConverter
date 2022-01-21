fun main() {
    val array = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()

    if (m in array) {
        println("YES")
    } else {
        println("NO")
    }
}