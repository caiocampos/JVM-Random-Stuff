class ReverseString {
    fun reverse(input: String): String {
        var res = ""
        for (i in input.length - 1 downTo 0) {
            res += input[i]
        }
        return res
    }
}

fun main() {
    val reverseString = ReverseString()
    println(reverseString.reverse("reverse"))
}
