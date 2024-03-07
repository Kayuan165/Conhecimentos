fun main() {
    val calculadora = Calculadora()

    println("Digite o primeiro número:")
    val num1 = readLine()!!.toDouble()

    println("Digite o segundo número:")
    val num2 = readLine()!!.toDouble()

    println("Escolha a operação:")
    println("1. Soma")
    println("2. Subtração")
    println("3. Multiplicação")
    println("4. Divisão")
    val operacao = readLine()!!.toInt()

    try {
        val resultado = when (operacao) {
            1 -> calculadora.soma(num1, num2)
            2 -> calculadora.subtracao(num1, num2)
            3 -> calculadora.multiplicacao(num1, num2)
            4 -> calculadora.divisao(num1, num2)
            else -> throw IllegalArgumentException("Operação inválida")
        }
        println("Resultado: $resultado")
    } catch (e: ArithmeticException) {
        println("Erro: ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Erro: ${e.message}")
    }
}