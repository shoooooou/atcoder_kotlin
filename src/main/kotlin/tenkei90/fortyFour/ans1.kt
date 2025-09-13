package fortyFour

fun main() {
    val (n, q) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }.toMutableList()
//    println(a)
    var offset = 0
    repeat(q) {
        val (t, x, y) = readln().split(" ").map { it.toInt() }
        when (t) {
            1 -> a.swap((x - 1 + offset) % n, (y - 1 + offset) % n)
            2 -> offset = (offset - 1 + n) % n
            3 -> println(a[(x - 1 + offset) % n])
        }
    }
}

fun <T> MutableList<T>.swap(a: Int, b: Int) {
    val temp = this[a]
    this[a] = this[b]
    this[b] = temp

}