package sixtyOne

fun main() {
    val q = readln().toInt()
    val list = mutableListOf<Int>()
    repeat(q) {
        val (t, x) = readln().split(" ").map { it.toInt() }
        when (t) {
            1 -> list.add(0, x)
            2 -> list.add(x)
            3 -> println(list[x - 1])
        }
    }
}