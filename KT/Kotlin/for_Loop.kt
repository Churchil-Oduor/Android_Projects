fun main() {
    val items = listOf("cows", "goats", "sheep")
    for (item in items) {
        println(item)
    }


    for (index in items.indices) {
        println("${index + 1}. ${items[index]}")
    }
}