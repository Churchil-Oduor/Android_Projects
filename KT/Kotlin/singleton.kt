object Logger {
    fun log(msg: String){ println("Logged: ${msg}")}
}

fun main() {
    Logger.log("Testing 123...")
    Logger.log("Running ...")
}
