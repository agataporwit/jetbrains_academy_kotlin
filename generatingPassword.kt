//Agata P.

const val ZERO = 0
const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4
var last = "$"
var rList = mutableListOf(ONE, TWO, THREE, FOUR)
var pw = mutableListOf<Int>()

fun main() {
    pw = readLine()!!.split(" ").asReversed().map { it.toInt() }.toMutableList()
    pw.add(FOUR, 2 * pw[0] - pw.sum())
    while (pw[ZERO] > ZERO) {
        when (val select = rList.random()) {
            ONE -> if (pw[ONE] > ZERO) { generate('1'..'9'); pw[ONE]-- } else rList.remove(select)
            TWO -> if (pw[TWO] > ZERO) { generate('a'..'z'); pw[TWO]-- } else rList.remove(select)
            THREE -> if (pw[THREE] > ZERO) { generate('A'..'Z'); pw[THREE]-- } else rList.remove(select)
            FOUR -> if (pw[FOUR] > ZERO) { generate('!'..'~'); pw[FOUR]-- } else rList.remove(select)
        }
    }
}

fun generate(charRange: CharRange) {
    charRange.random().toString().let {
        if (it != last) { print(it); last = it; pw[ZERO]-- } else { generate(charRange) }
    }
}
