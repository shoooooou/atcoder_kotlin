package fiftyFive

fun main() {
    val (n, p, q) = readln().split(" ").map { it.toLong() }
    val list = readln().split(" ").map { it.toLong() }
    var ans = 0L
    for (i in 0 until (n - 4).toInt()) {
        for (j in i + 1 until (n - 3).toInt()) {
            for (k in j + 1 until (n - 2).toInt()) {
                for (l in k + 1 until (n - 1).toInt()) {
                    for (m in l + 1 until n.toInt()) {
                        val product = (list[i] % p * list[j] % p * list[k] % p * list[l] % p * list[m] % p) % p
                        if (product == q) {
                            ans++
                        }
                    }
                }
            }
        }
    }
    print(ans)
}