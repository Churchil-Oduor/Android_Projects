class Robot {

    companion object {
        var count = 0;
    }

    init {
        println("Initializing a Robot...")
        count++
        println("Count: ${count}")
    }

    fun getCount(): Int {
        return count
    }
}

fun main() {
    val rbt1 = Robot()

    val rbt4: Robot = Robot()

}