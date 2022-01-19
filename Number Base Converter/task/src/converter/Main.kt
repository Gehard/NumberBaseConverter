package converter

fun main() {
    do {
        print("Do you want to convert /from decimal or /to decimal? (To quit type /exit)")
        val choice = readLine()!!
        if (choice == "/exit") {
            break
        }
        if (choice == "/from") {
            print("Enter a number in decimal system:")
            val decimal = readLine()!!.toInt()
            print("Enter the target base:")
            val base = readLine()!!.toInt()
            when(base) {
                2 -> println("Conversion result: ${Integer.toBinaryString(decimal)}")
                8 -> println("Conversion result: ${Integer.toOctalString(decimal)}")
                16 -> println("Conversion result: ${Integer.toHexString(decimal)}")
            }

        } else if (choice == "/to") {
            print("Enter source number:")
            val n = readLine()!!

            print("Enter source base:")
            val base = readLine()!!.toInt()

            when (base) {
                2 -> println("Conversion to decimal result: ${n.toLong(radix = 2)}")
                8 -> println("Conversion to decimal result: ${n.toLong(radix = 8)}")
                16 -> println("Conversion to decimal result: ${n.toLong(radix = 16)}")
            }

        }


    }while (true)

}