fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}

fun main() {
    val isLeap = isLeapYear(2020)
    println(isLeap)
}
