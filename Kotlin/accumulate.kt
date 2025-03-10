fun <T> accumulate(list: List<T>, acc: (T) -> T): List<T> {
    val res = mutableListOf<T>()
    for (el in list) {
        res.add(acc(el))
    }
    return res
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubledNumbers = accumulate(numbers) { it * 2 }
    println(doubledNumbers)

    val strings = listOf("a", "b", "c")
    val uppercaseStrings = accumulate(strings) { it.uppercase() }
    println(uppercaseStrings)
}
