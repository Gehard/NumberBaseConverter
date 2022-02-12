fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    println(a xor b xor c)
}