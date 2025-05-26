open class Employee(val name: String, val salary: Double) {
    open fun work() {
        println("Employee $name is working...")
    }

    open fun calculateBonus(): Double {
        return salary * 0.1
    }
}


class Manager(
    name: String,
    salary:Double): Employee(name, salary) {
        override
        fun work() {
            println("Manager $name is Working...")
        }

        override
        fun calculateBonus(): Double {
            return salary * 0.2
        }
}

class Developer(
     name: String, 
     salary: Double): Employee(name, salary){

        override
        fun work() {
            println("Developer $name is working...")
        }

        override
        fun calculateBonus(): Double {
            return salary * 0.15
        }
}


fun main() {
    val emp = Employee("Xavier", 4000.0)
    emp.work()
    println(emp.calculateBonus())

    val dev = Developer("Shegger", 600000.0)
    dev.work()
    println(dev.calculateBonus())
    
}