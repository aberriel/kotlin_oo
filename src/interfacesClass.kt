// Nenhum atributo tem valor (estado). Então, só declarações
interface Machine {
    var peso: Float
    fun turnOn()
    fun turnOff() {
        println("Off")
    }
}

// Não existe herança múltipla em Kotlin ou em Java.
// Mas podem implementar interfaces múltiplas
class Computer(override var peso: Float) : Machine {
    override fun turnOn() {
        TODO("Not yet implemented")
    }
}

interface Interface1 {
    fun ola()
}

interface Interface2 {
    fun ola()
}

/*
Uma classe pode implementar mais de uma interface (como no caso abaixo.
E se ambas as interfaces tiverem método com mesmo nome, não preciso implementar 2 vezes
o método (como no caso com o método "ola()". Basta uma implementação que sobrecrevo o método
das 2 interfaces.
 */
class InterfaceImplementation1: Interface1, Interface2 {
    override fun ola() {
        TODO("Not yet implemented")
    }
}

interface Interface3 {
    fun ola() {
        println("Interface 3")
    }
}

interface Interface4 {
    fun ola() {
        println("Interface 4")
    }
}

class InterfaceImplementation2 : Interface3, Interface4 {
    override fun ola() {
        /*
            Quando as diversas interfaces tem um método de mesmo nome e estão implementados,
            precisamos sinalizar qual interface estamos implementando
         */
        super<Interface3>.ola()
    }
}

fun main() {
}