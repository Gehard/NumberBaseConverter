import kotlin.math.*
fun main() {
    
    val (a, b) = readLine()!!.trim().split("\\s+".toRegex()).map (String::toInt)
    val (c, d) = readLine()!!.trim().split("\\s+".toRegex()).map (String::toInt)
    
    val x1 = abs(a)
    val y1 = abs(b)
    val x2 = abs(c)
    val y2 = abs(d)
    
    
    if (abs(y2 - y1) == 1 && abs(x2 - x1) == 2 || abs(y2 - y1) == 2 && abs(x2 - x1) == 1) {
        println("YES")
    } else {
        println("NO")
    }
    
}
