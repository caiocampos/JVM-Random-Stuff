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
