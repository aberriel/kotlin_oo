interface Funcionario {
    fun calculaBonus()
}

class Gerente : Funcionario {
    override fun calculaBonus() {
        println("Bonus: 500")
    }
}

class Tecnico : Funcionario {
    override fun calculaBonus() {
        println("Bonus: 200")
    }
}

class Analista : Funcionario {
    override fun calculaBonus() {
        TODO("Not yet implemented")
    }
}

fun main() {
    var f1: Funcionario = Gerente()
    var f2: Funcionario = Tecnico()
    var f3: Funcionario = Analista()

    calculo(f1)
    calculo(f2)
}

fun calculo(funcionario: Funcionario) {
    funcionario.calculaBonus()
}