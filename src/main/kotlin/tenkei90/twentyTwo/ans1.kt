package tenkei90.twentyTwo

import kotlin.math.absoluteValue

fun main() {
    val (a, b, c) = readln().split(" ").map { it.toLong() }
    val size = a.gcd(b).gcd(c)
    println("${(a / size - 1) + (b / size - 1) + (c / size - 1)}")
}

fun Long.gcd(other: Long): Long {
//    require(this >= 0 && other >= 0) { "GCD is typically defined for non-negative integers." }
    var a = this.absoluteValue
    var b = other.absoluteValue
    while (b != 0L) {
        val temp = b
        b = a % b
        a = temp
    }
    return a
}