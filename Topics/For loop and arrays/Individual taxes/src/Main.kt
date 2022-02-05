fun main() {
    print(
        Array(readLine()!!.toInt()) { readLine()!!.toInt() }
            .map { it * readLine()!!.toDouble() }
            .let { it.indexOf(it.maxOrNull()) + 1 }
    )
}