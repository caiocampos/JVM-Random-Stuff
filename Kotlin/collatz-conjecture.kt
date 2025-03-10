object CollatzConjecture {
    fun steps(n: Int): Int {
        require(n > 0) { "Only positive numbers are allowed" }
        if (n == 1) return 0
        var steps = 0
        var currentN = n
        while (currentN != 1) {
            currentN = if (currentN and 1 == 0) currentN shr 1 else 3 * currentN + 1
            steps++
        }
        return steps
    }
}
