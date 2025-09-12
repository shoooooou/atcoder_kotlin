package fortySix

fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }.toList()
    val b = readln().split(" ").map { it.toInt() }.toList()
    val c = readln().split(" ").map { it.toInt() }.toList()
    var aCnt = IntArray(46)
    var bCnt = IntArray(46)
    var cCnt = IntArray(46)
    var ans = 0L;
    repeat(n) {
        aCnt[a[it] % 46]++
        bCnt[b[it] % 46]++
        cCnt[c[it] % 46]++
    }
    for (i in 0 until 46) {
        for (j in 0 until 46) {
            for (k in 0 until 46) {
                if ((i + j + k) % 46 == 0) {
                    ans += aCnt[i].toLong() * bCnt[j] * cCnt[k]
                }
            }
        }
    }
    print(ans)
}