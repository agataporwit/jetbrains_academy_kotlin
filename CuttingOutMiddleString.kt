//Agata P. 

fun main() {
    var word = readLine()!!

    if (word.length % 2 == 0) {
        word = word.removeRange(word.length / 2 - 1..word.length / 2)
    } else {
        word = word.removeRange(word.length / 2 until word.length / 2 + 1)
    }
    print(word)
}
