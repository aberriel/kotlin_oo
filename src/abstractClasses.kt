// Mamífero - Animal

/*
    Classes abstratas definem comportamentos que outras classes podem usar.
    Não podem ser instanciadas.
 */
abstract class Mamifero (var nome: String) {
    var peso: Float = 0f

    abstract fun falar()
    open fun dormir() {
        println("Estou dormindo")
    }
}

class Cachorro(nome: String, peso: Float) : Mamifero(nome) {
    /* O init executa quando a classe é iniciada, sempre, independente do número
        de construtores que ela tenha. */
    init {
        this.peso = peso
    }

    override fun falar() {
        println("au au")
    }
}

class Gato(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("miau")
    }
}

fun main() {
    Cachorro("Scooby", 100f).dormir()
}