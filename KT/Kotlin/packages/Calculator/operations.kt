package Calculator

class Calculator(val x: Int, val y: Int) {
    fun sum() = x + y
    fun sub() = x - y

    fun div() {
        var res
        try {
            res = x / y
            return res
        } catch (e: ArithmeticException) {
            println("Error: $e")
        }
    }

    fun mod() {
        return x % y
    }

}
