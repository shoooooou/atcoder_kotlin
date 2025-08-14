fun main() {
    val (rowCount, colCount) = readln().split(" ").map { it.toLong() }
    val matrix = Array(rowCount.toInt()) {
        readln().split(" ").map { it.toLong() }.toLongArray()
    }
    val rowSums = matrix.map { it.sum() }.toLongArray()
    val colSums = matrix.fold(LongArray(colCount.toInt())) { acc, row ->
        row.forEachIndexed { ind, value -> acc[ind] += value }
        acc
    }
    val sb = StringBuilder()

    repeat(rowCount.toInt()) { i ->
        repeat(colCount.toInt()) { j ->
            sb.append(rowSums[i] + colSums[j] - matrix[i][j])
            if (j == colCount.toInt() - 1) {
                sb.append("\n")
            } else {
                sb.append(" ")
            }
        }
    }
    print(sb.toString())
}