class Pessoa {
    /*
        Quando tenho um atributo que não quero iniciar logo de cara, porque terei
        algum processamento posterior ou chamarei algum método depois que seta o valor
        dessa variável (e, portanto, não faz sentido defini-la no código), eu uso a
        palavra reservada "lateinit" e terei que declarar este atributo como var, senão
        não poderei setar o valor dele depois.
     */
    lateinit var nome: String

    fun geradorNome() {
        this.nome = "asdjnj"
    }
}

fun main() {
    val p = Pessoa()
    p.geradorNome()
}