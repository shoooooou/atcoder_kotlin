package twentySeven

fun main() {
    val n = readln().toInt()
    val userMap = mutableMapOf<String, Int>()
    val userId = 1
    repeat(n) {
        val user = readln()
        if (user !in userMap) {
            userMap[user] = userId
            println(userId)
        }
    }
}