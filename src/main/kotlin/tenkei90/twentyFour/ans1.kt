package twentyFour

import kotlin.math.abs

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val row1 = readln().split(" ").map { it.toInt() }
    val row2 = readln().split(" ").map { it.toInt() }
    var difnums = IntArray(n)
    for (i in 0 until n) {
        difnums[i] = abs(row1[i] - row2[i])
    }
    val difsum = difnums.sum()
    if (k < difsum) {
        println("No")
        return
    }
    if (k % 2 == difsum % 2) {
        println("Yes")
    } else {
        println("No")
    }
    return
}