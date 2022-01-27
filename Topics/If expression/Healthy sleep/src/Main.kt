fun main() {    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val h = readLine()!!.toInt()
    
    if (h >= a && h <= b) {
        print("Normal")
    } else if (h > b) {
        print("Excess")
    } else {
        print("Deficiency")
    }
}
