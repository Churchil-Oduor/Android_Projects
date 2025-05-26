interface Vehicle {
    fun startEngine()
    fun stopEngine() {
        println("Vehicle stopped")
    }
}

class Car(val brand: String): Vehicle {
    override
    fun startEngine() {
        println("$brand has started the engine...VROOMM!!!")
    }

}


fun main() {
    val car = Car("Ferrari")
    car.startEngine()
    car.stopEngine()

}