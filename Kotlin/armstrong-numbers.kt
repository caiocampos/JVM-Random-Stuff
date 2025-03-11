object ArmstrongNumbers {
    fun isArmstrongNumber(n: Int): Boolean {
        if (n < 10) {
            return true
        }
        val sVal = n.toString()
        val len = sVal.length
        var sum = 0
        for (c in sVal) {
            sum += Math.pow(c.digitToInt().toDouble(), len.toDouble()).toInt()
        }
        return sum == n
    }
}

fun main() {
    val values = MutableList(10) { it } // valids
    values.addAll(listOf(153, 370, 371, 407, 1634, 8208, 9474)) // valids
    values.addAll(listOf(10, 99, 135, 307, 317, 470, 1463, 8820, 9744)) // invalids
    for (i in values) {
    	println("is armstrong number: ${i} ${ArmstrongNumbers.isArmstrongNumber(i)}")
    }
}
