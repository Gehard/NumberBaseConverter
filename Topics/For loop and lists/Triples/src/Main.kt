fun main() {
    val numbers = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    val triplets = numbers.windowed(3).toList()

    val consecutiveTriplets = triplets.filter { (a, b, c) ->
        a + 1 == b && b + 1 == c
    }

    println(consecutiveTriplets.size ?: 0)
}