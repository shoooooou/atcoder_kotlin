package fifty

fun main() {
    val MOD_NUM = 1000000000 + 7
    val (n, l) = readln().split(" ").map { it.toInt() }
    var step = IntArray(n + 1)
    step[0] = 1
    repeat(n) {
        step[it + 1] = (step[it + 1] + step[it]) % MOD_NUM
        if (it + l <= n) {
            step[it + l] = (step[it + l] + step[it]) % MOD_NUM
        }
    }
    print(step[n])
}