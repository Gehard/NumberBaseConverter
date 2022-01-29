import kotlin.random.Random

fun createDiceGameRandomizer(n: Int): Int {
    var seed = 0

    for (j in 0..n) {
        val friend = MutableList(n) { Random(j).nextInt(1, 7) }
        val me = mutableListOf<Int>()

        if (me.sum() > friend.sum()) {
            seed = j
        }
    }

    return seed
    }