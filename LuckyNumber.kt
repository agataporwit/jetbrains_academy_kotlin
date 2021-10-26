//Agata P. 


fun main() {
    val n = readLine()!!.toString()
    val len = n.length
    val half1 = n.substring(0, n.length / 2)
    val half2 = n.substring(n.length / 2, len)
    var s1 = 0
    var s2 = 0

    for (c in half1) {
        s1 += c.toString().toInt()
    }
    for (c in half2) {
        s2 += c.toString().toInt()
    }
    println(if (s1 == s2) "YES" else "NO")
}
