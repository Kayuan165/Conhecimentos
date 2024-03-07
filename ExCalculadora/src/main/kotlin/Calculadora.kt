import java.lang.ArithmeticException

class Calculadora {

    fun soma(a: Int, b: Int): Int {
        return a + b
    }

    fun subtracao(a: Int, b: Int): Int {
        return a - b
    }

    fun multiplicacao(a: Int, b: Int): Int {
        return a * b
    }

    fun divisao(a: Int, b: Int): Double {
        if (b != 0) {
            return a.toDouble() / b
        } else {
            throw ArithmeticException("Erro: Divisão por zero")
        }
    }

    fun soma(a: Double, b: Double): Double {
        return a + b
    }

    fun subtracao(a: Double, b: Double): Double {
        return a - b
    }

    fun multiplicacao(a: Double, b: Double): Double {
        return a * b
    }

    fun divisao(a: Double, b: Double): Double {
        if (b != 0.0) {
            return a / b
        } else {
            throw ArithmeticException("Erro: Divisão por zero")
        }
    }
}