class Quadrado(val area: Float){
    override fun toString(): String {
        // Pra imprimir igual uma data class
        return "Quadrado(area=$area)"
    }
}

// Classe apenas para transitar dados
// Ainda permite usar funções dentro dela
data class Triangulo(val area: Float){
}

fun main(){
    val q1: Quadrado = Quadrado(10f)
    val q2: Quadrado = Quadrado(10f)

    val t1: Triangulo = Triangulo(10f)
    val t2: Triangulo = Triangulo(10f)

    // false: compara posições de memória
    println(q1 == q2)
    // true: compara somente os valores
    println(t1 == t2)
}