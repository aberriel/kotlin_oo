// Eu tenho que usar a palavra "open" quando quero que uma classe seja extendida
open class Maquina(val marca: String) {
    // Também existe o "open" para métodos
    /**
     * Imprime a marca da máquina
     * @author Anselmo Lira
     */
    open fun minhaMarca() {
        println("Minha marca é $marca")
    }
}

// Computaror é "filha" de máquina. Pode herdar os métodos e atributos
// private só é acessível dentro do pacote
private class Computador(marca: String, val nucleos: Int) : Maquina(marca) {
    override fun minhaMarca() {
        // Estpu sobrescrevendo o "minhaMarca"
        // O super, estou referenciando a classe pai, a qual herdei
        super.minhaMarca()
    }
    public fun ligar() {}
    public fun processar() {}
    public fun desligar() {}

    // Método privado só acessível dentro da classe
    private fun validate() {}
}

fun useComputador() {
    val c: Computador = Computador("Dell", 4)
    with(c) {
        ligar()
        processar()
        desligar()
    }
}