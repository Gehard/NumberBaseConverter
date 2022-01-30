fun main() {
    val size = readLine()!!.toInt()
    val income = MutableList(size) { readLine()!!.toInt() }
    val tax = MutableList(size) { readLine()!!.toInt() }
    val paid = mutableListOf<Double>()

    for (i in income) {
        paid.add((i * tax[income.indexOf(i)]).toDouble() / 100)

    }

    println(paid.indexOf(paid.maxOrNull()) + 1)

}