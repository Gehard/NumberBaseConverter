import java.math.BigDecimal
import java.math.RoundingMode.CEILING

fun main() {
    val amount = BigDecimal(readLine()!!)
    val rate = BigDecimal(readLine()!!)
    val year = BigDecimal(readLine()!!)

    val final = amount * (BigDecimal.ONE + rate.setScale(2 + rate.scale()) / BigDecimal("100")).pow(year.toInt())

    println("Amount of money in the account: ${final.setScale(2, CEILING)}")
}