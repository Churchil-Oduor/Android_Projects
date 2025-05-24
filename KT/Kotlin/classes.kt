class Rectangle(val length: Int, val width: Int) {
    fun area(): Int {
        return length * width;
    }

    fun perimeter(): Int {
        return 2 * (length + width)
    }
}


fun main() {
    val rect = Rectangle(3, 4);
    var area = rect.area();
    var perimeter = rect.perimeter();
    println("Area: ${area}\nPerimeter: $perimeter");
}