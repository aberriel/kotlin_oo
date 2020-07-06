// Kotlin aceita definir classe só com "class NomeDaClasse"
class Person(var name: String, var birthYear: Int)

class Person2(var name: String) {
    var birthYear: Int? = null

    constructor(name: String, birthYear: Int) : this(name) {
        this.birthYear = birthYear
    }

    fun saudacao() {
        println("Olá, meu nome é ${this.name} e nasci em $birthYear.")
    }
}

fun main() {
    var p1 = Person2("Anselmo", 1986)
    var p2 = Person2("Anselmo")

    p1.saudacao()
    p2.saudacao()
}