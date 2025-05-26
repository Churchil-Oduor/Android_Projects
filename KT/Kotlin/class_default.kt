class User(
    val isStudent: Boolean? = true, 
    val name: String, 
    val age: Int)
     {
    companion object {
        var count = 0
    }
    init {

        count++
        val  msg ="Initializing student ${count}".also(::println)
    }

    fun whoami() {
        val response = "My name is $name and I am $age years old".also(::println)
    }
}


fun main() {
    val user = User(name = "Churchil", age = 7)
    user.whoami()

}
