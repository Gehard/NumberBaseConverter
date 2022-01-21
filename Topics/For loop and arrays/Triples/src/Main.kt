fun main() {
    val array = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }

    val l = array.toList().windowed(3)

    var count = 0

    for (i in l) {
        if (i[0] + 1 == i[1] && i[1] + 1 == i[2]) {
            count += 1
        }
    }

    println(count)
}