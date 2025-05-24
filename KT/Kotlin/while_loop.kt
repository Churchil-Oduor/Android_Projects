fun main() {
    val items = listOf("cows", "goats", "sheep")
    var count = items.size - 1

    while (count >= 0) {
        println("${items[count]}")
        count--
    }
}