//Agata P. 


import java.util.*

fun main() {
    val input = readLine()!! 
    val newString = input.split("?", "&", "=").drop(1).toMutableList()
    val newArray = newString.indexOf("pass")

    for (i in newString.indices) {
        if (newString[i] == "") {
            newString[i] = "not found"
        }
    }

    for (i in newString.indices step 2) {
        if (newString[i] !== "") {
            println("${newString[i]} : ${newString[i + 1]}")
        }
    }

    if (newString.contains("pass")) {
        println("password : ${newString[newArray + 1]}")
    }

}
