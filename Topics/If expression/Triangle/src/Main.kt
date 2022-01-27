fun main() {
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    val checkA = a < b + c
    val checkB = b < c + a
    val checkC = c < a + b

    if (checkA && checkB && checkC) {
        println("YES")
    } else {
        println("NO")
    }
}