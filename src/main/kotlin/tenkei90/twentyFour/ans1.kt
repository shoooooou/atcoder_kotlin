package twentyFour

import kotlin.math.abs

fun main() {
    val (_, k) = readln().split(" ").map { it.toInt() }
    val row1 = readln().split(" ").map { it.toInt() }
    val row2 = readln().split(" ").map { it.toInt() }
    var difsum = row1.zip(row2) { a, b -> abs(a - b) }.sum()
    val result = when {
        k < difsum -> "No"
        k % 2 == difsum % 2 -> "Yes"
        else -> "No"
    }
    println(result)
    return
}