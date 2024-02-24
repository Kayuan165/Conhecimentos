import kotlin.time.measureTime

class Pessoas {
    var nome = ""
    var idade = 0
    var peso = 0.0
    var altura = 0.0
    var imc = 0.0

    fun pessoa1(): Void? {
        try {
            print("Digite o nome da primeira pessoa: ")
            var entrada: String = readln()
            nome = entrada

            print("Digite a idade da primeira pessoa: ")
            entrada = readln()
            idade = (entrada.toInt())

            print("Digite o peso da primeira pessoa: ")
            entrada = readln()
            peso = (entrada.toDouble())

            print("Digite a altura da primeira pessoa: ")
            entrada = readln()
            altura = (entrada.toDouble())

            imc = (peso / (altura * altura))

            if (imc < 18.5) {
                println(
                    "$nome de $idade anos, com sua altura de ${
                        String.format("%.2f", altura)
                    } e pesando ${String.format("%.2f", peso)} Kg possui o imc igual a ${
                        String.format("%.2f", imc)
                    }"
                )
                println("Abaixo do peso ideal")
            } else if (imc > 18.5 && imc < 24.9) {
                println(
                    "$nome de $idade anos, com sua altura de ${
                        String.format("%.2f", altura)
                    } e pesando ${String.format("%.2f", peso)} Kg possui o imc igual a ${
                        String.format("%.2f", imc)
                    }, está no peso normal "
                )
            } else if (imc > 25 && imc < 29.9) {
                println(
                    "$nome de $idade anos, com sua altura de ${
                        String.format("%.2f", altura)
                    } e pesando ${String.format("%.2f", peso)} Kg possui o imc igual a ${
                        String.format("%.2f", imc)
                    }, está acima do peso "
                )
            } else if (imc > 30 && imc < 34.9) {
                println(
                    "$nome de $idade anos, com sua altura de ${
                        String.format("%.2f", altura)
                    } e pesando ${String.format("%.2f", peso)} Kg possui o imc igual a ${
                        String.format("%.2f", imc)
                    }, isso é obesidade de grau 1 "
                )
            } else if (imc > 35 && imc < 39.9) {
                println(
                    "$nome de $idade anos, com sua altura de ${
                        String.format("%.2f", altura)
                    } e pesando ${String.format("%.2f", peso)} Kg possui o imc igual a ${
                        String.format("%.2f", imc)
                    }, isso é obesidade de grau 2 "
                )
            } else if (imc > 40) {
                println(
                    "$nome de $idade anos, com sua altura de ${
                        String.format("%.2f", altura)
                    } e pesando ${String.format("%.2f", peso)} Kg possui o imc igual a ${
                        String.format("%.2f", imc)
                    }, isso é obesidade de grau 3 "
                )
            }
        } catch (e: NumberFormatException) {
            println("É necessário digitar as informações")
        }
        return null
    }
    fun pessoa2(): Void?{
        try{
        print("Digite o nome da segunda pessoa: ")
        var entrada: String = readln()
        nome = entrada

        print("Digite a idade da segunda pessoa: ")
        entrada = readln()
        idade = (entrada.toInt())

        print("Digite o peso da segunda pessoa: ")
        entrada = readln()
        peso = (entrada.toDouble())

        print("Digite a altura da segunda pessoa: ")
        entrada = readln()
        altura = (entrada.toDouble())

        imc = (peso/(altura*altura))

        if(imc < 18.5 ) {
            println("$nome de $idade anos, com sua altura de ${
                String.format("%.2f",altura)
            } e pesando ${String.format("%.2f",peso)} Kg possui o imc igual a ${
                String.format("%.2f",imc)}")
            println("Abaixo do peso ideal")
        }
        else if(imc > 18.5 && imc < 24.9 ){
            println("$nome de $idade anos, com sua altura de ${
                String.format("%.2f",altura)
            } e pesando ${String.format("%.2f",peso)} Kg possui o imc igual a ${
                String.format("%.2f",imc)}, está no peso normal ")
        }
        else if(imc > 25 && imc < 29.9){
            println("$nome de $idade anos, com sua altura de ${
                String.format("%.2f",altura)
            } e pesando ${String.format("%.2f",peso)} Kg possui o imc igual a ${
                String.format("%.2f",imc)}, está acima do peso ")
        }
        else if(imc > 30 && imc < 34.9){
            println("$nome de $idade anos, com sua altura de ${
                String.format("%.2f",altura)
            } e pesando ${String.format("%.2f",peso)} Kg possui o imc igual a ${
                String.format("%.2f",imc)}, isso é obesidade de grau 1 ")
        }
        else if(imc > 35 && imc < 39.9){
            println("$nome de $idade anos, com sua altura de ${
                String.format("%.2f",altura)
            } e pesando ${String.format("%.2f",peso)} Kg possui o imc igual a ${
                String.format("%.2f",imc)}, isso é obesidade de grau 2 ")
        }
        else if(imc > 40){
            println("$nome de $idade anos, com sua altura de ${
                String.format("%.2f",altura)
            } e pesando ${String.format("%.2f",peso)} Kg possui o imc igual a ${
                String.format("%.2f",imc)}, isso é obesidade de grau 3 ")
        }
    }catch(e: NumberFormatException){
        println("É necessário digitar as informações ")
        }
        return null
    }
}





