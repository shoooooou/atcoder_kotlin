package thirtyEight

fun main() {
    val MAX_VALUE = 1000000000000000000L
    val (a, b) = readln().split(" ").map { it.toLong() }
    val quotient = (a / gcd(a, b))
    if (quotient > MAX_VALUE / b) {
        println("Large")
        return
    }
    println(quotient * b)
}

fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) a else gcd(b, a % b)
}