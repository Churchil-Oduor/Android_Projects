fun input(x: Any): String {
    var res = when (x) {
        1 -> "One is the input"
        is Boolean -> "you entered a bool"
        is String -> "String input has been entered"
        else -> "Nothing"
    }

    return res

}

fun main() {
    print(input(4.7))
}