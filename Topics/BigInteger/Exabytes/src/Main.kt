import java.math.BigInteger

const val ST = 63
fun main() {
    val exa = readLine()!!.toBigInteger()
    println(exa * BigInteger.TWO.pow(ST))
}