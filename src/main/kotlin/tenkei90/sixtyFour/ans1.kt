package sixtyFour

import kotlin.math.abs
import kotlin.math.absoluteValue

fun main() {
    val (n, q) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toLong() }.toMutableList()
    val diffList = LongArray(n - 1)
    repeat(n - 1) {
        diffList[it] = a[it] - a[it + 1]
    }
    var inconvenience = diffList.sumOf { it.absoluteValue }
    repeat(q) {
        val (l, r, v) = readln().split(" ").map { it.toInt() }
        if (l > 1) {
            val old = diffList[l - 2]
            diffList[l - 2] -= v.toLong()
            inconvenience += abs(diffList[l - 2]) - abs(old)
        }
        if (r < n) {
            val old = diffList[r - 1]
            diffList[r - 1] += v.toLong()
            inconvenience += abs(diffList[r - 1]) - abs(old)
        }
        println(inconvenience)
    }


}