fun main() {
    println(readLine()!!.let { if ("." in it) it.split(".")[1][0] else 0 })
}