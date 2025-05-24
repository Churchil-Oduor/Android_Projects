fun main() {
    val x = listOf(1, 4, -6, -8, -4)
    val positives = x.filter{it > 0}
    print(positives.toString())
}