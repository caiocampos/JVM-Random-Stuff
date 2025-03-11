fun squareOfSum(n: Int): Long {
    val sum = n.toLong() * (n + 1) / 2
    return sum * sum
}

fun sumOfSquares(n: Int): Long {
    return n.toLong() * (n + 1) * (2 * n + 1) / 6
}

class Squares(n: Int) {
    var number: Int = n
        set(value) {
            field = value
            squareSum = squareOfSum(value)
            sumSquare = sumOfSquares(value)
        }
        get() = number
        
    private var squareSum: Long = squareOfSum(n)
    private var sumSquare: Long = sumOfSquares(n)

    val squareOfSum: Long
        get() = squareSum

    val sumOfSquares: Long
        get() = sumSquare

    val difference: Long
        get() = squareSum - sumSquare
}

fun main() {
    var squares = Squares(5)
    println("Square of sum: ${squares.squareOfSum}")
    println("Sum of squares: ${squares.sumOfSquares}")
    println("Difference: ${squares.difference}")

    squares.number = 10
    println("Square of sum (after change): ${squares.squareOfSum}")
    println("Sum of squares (after change): ${squares.sumOfSquares}")
    println("Difference (after change): ${squares.difference}")
}
