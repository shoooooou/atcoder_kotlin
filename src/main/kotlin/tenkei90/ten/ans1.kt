package tenkei90.ten

fun main() {
    val n = readln()!!.toInt()
    val list1 = MutableList(n + 1) { 0 }
    val list2 = MutableList(n + 1) { 0 }
    repeat(n) {
        val (group, point) = readln().split(" ").map { it.toInt() }
        if (group == 1) {
            list1[it + 1] = list1[it] + point
            list2[it + 1] = list2[it]
        } else {
            list2[it + 1] = list2[it] + point
            list1[it + 1] = list1[it]
        }
    }
    val q = readln().toInt()
    repeat(q) {
        val (st, en) = readln().split(" ").map { it.toInt() }
        val ans1 = list1[en] - list1[st - 1]
        val ans2 = list2[en] - list2[st - 1]
        println("$ans1 $ans2")
    }
}
