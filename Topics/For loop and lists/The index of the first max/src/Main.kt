fun main() {
    val listIntegers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    println(listIntegers.indexOf(listIntegers.maxOrNull()))
}