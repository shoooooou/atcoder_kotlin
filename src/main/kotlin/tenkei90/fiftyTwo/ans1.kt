package fiftyTwo

fun main() {
    val MOD_NUM = 1000000000 + 7
    val n = readln().toInt()
    var ans = 1L
    repeat(n) {
        val saikoro = readln().split(" ").map { it.toLong() }.toMutableList()
        ans = (ans * saikoro.sum()) % MOD_NUM
    }

    print(ans)
}