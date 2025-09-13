package thirtyThree

fun main() {
    val (h, w) = readln().split(" ").map { it.toInt() }
    if (h == 1 || w == 1) {
        println(h * w)
        return;
    }
    val ans = (h / 2 + h % 2) * (w / 2 + w % 2)
    println(ans)
}
