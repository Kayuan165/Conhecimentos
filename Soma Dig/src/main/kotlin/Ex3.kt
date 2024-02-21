fun main() {
    var soma = 0
    var qtd = 0
    var media = 0.0
    var maior = Int.MIN_VALUE
    var menor = Int.MAX_VALUE
    var par = 0
    var impar = 0

    println("Digite um número(0 para sair): ")
    var numero: Int? = readLine()?.toIntOrNull()

    while (numero != 0) {
        if (numero != null) { // Verifica se o número não é nulo
            soma += numero
            qtd++

            if (numero > maior) {
                maior = numero
            }
            if (numero < menor) {
                menor = numero
            }
            if (numero % 2 == 0) {
                par++
            } else {
                impar++
            }
        }
        numero = readLine()?.toIntOrNull()
    }

    println("A soma de todos os números digitado é de: $soma")
    println("A quantidade de números digitado foi de: $qtd")
    println("A média de todos os números é de: ${media(soma, qtd)}")
    println("O maior número digitado foi de: $maior")
    println("O menor número digitado foi de: $menor")
    println("A média de números pares digitado foi de: ${media(par, qtd)}")
    println("A quantidade de números impares digitado foi de: $impar")
}

fun media(soma: Int, quantidade: Int): Double {
    if (quantidade == 0) return 0.0
    return soma.toDouble() / quantidade
}
