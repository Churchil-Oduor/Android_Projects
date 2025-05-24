// Define classes (even empty ones need braces)
class Rectangle
class Circle
class Trapezium

fun main() {
    val obj = Trapezium()

    when (obj) {
        is Rectangle -> println("obj is a Rectangle")
        is Circle -> println("obj is a Circle")      // fixed: not "square"
        is Trapezium -> println("obj is a Trapezium")
    }
}
