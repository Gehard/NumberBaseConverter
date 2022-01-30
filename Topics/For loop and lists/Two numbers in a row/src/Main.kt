fun main() {
    val list = MutableList(readLine()!!.toInt()) { readLine()!! }.joinToString(" ")
    val pattern = readLine()!!
    println(if (list.contains(pattern) || list.contains(pattern.reversed())) "NO" else "YES")
}