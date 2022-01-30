fun main() {
    val listNum = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }

    val pm = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    if (listNum.containsAll(pm)) {
        println("YES")
    } else {
        println("NO")
    }
}