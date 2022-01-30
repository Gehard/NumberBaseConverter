fun main() {
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()

    if (m in numbers) {
        println("YES")
    } else {
        println("NO")
    }

}