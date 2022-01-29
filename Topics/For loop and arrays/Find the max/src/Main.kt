fun main() {
    val size = readLine()!!.toInt()
    val numbers = Array(size) { readLine()!!.toInt() }
    val maxIdx = numbers.indices.maxByOrNull { numbers[it] }

    println(maxIdx)
}