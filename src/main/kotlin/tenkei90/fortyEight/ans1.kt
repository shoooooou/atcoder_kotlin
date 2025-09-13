package fortyEight

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val numList = mutableListOf<Long>()
    for (i in 0 until n) {
        val (a, b) = readln().split(" ").map { it.toLong() }
        numList.add(b)
        numList.add(a - b)
    }
    numList.sortDescending()
    var ans = 0L
    repeat(k) {
        ans += numList[it]
    }
    print(ans)
}