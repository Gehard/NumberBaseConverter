fun main() {
    val array = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val n = array.joinToString()
    val c = readLine()!!

    if (n.contains(c[0]) && n.contains(c[2])) {
        println("YES")
    } else {
        println("NO")
    }

}
