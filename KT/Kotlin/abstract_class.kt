abstract class Shape {
    abstract fun area(): Double
}

class Rectangle(val length: Double = 1.0, val width: Double = 1.0): Shape() {
    override
    fun area() = length * width
}

fun main() {
    val rect = Rectangle(45.0, 67.0)
    println(rect.area())
}