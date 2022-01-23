package converter

fun main() {
    do {
        print("Enter two numbers in format: {source base} {target base} (To quit type /exit)")
        val (source, target) = readLine()!!.trim().split("\\s+".toRegex()).map (String::toString)

        if (source == "/exit") {
            break
        }
        println("Enter number in base $source to convert to base $target (To go back type /back)")

        if (source == "10") {
            when(target.toInt()) {
                2 -> println("Conversion result: ${Integer.toBinaryString(source.toInt())}")
                8 -> println("Conversion result: ${Integer.toOctalString(source.toInt())}")
                16 -> println("Conversion result: ${Integer.toHexString(source.toInt())}")
            }

        }
        if (source == "/from") {
            print("Enter a number in decimal system:")
            val decimal = readLine()!!.toInt()
            print("Enter the target base:")
            val base = readLine()!!.toInt()
            when(base) {
                2 -> println("Conversion result: ${Integer.toBinaryString(decimal)}")
                8 -> println("Conversion result: ${Integer.toOctalString(decimal)}")
                16 -> println("Conversion result: ${Integer.toHexString(decimal)}")
            }

        } else if (source == "/to") {
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