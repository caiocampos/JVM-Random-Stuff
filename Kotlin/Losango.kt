fun main(args: Array<String>) {
    var doisPontos = 22
    var numberSign = 1
    val total = 45
    val linhas = 10

    for (i in 0 until linhas) {
        if (i == 9) {
            imprimirCaracter(':', total)
            println()
        } else {
            imprimirCaracter(':', doisPontos)
            imprimirCaracter('#', numberSign)
            imprimirCaracter(':', doisPontos)
            println()

            if (i > 3) {
                doisPontos += 3
                numberSign -= 6
            } else {
                doisPontos -= 3
                numberSign += 6
            }
        }
    }
}

private fun imprimirCaracter(caractere: Char, quantidade: Int) {
    repeat(quantidade) {
        print(caractere)
    }
}
