/*
    No cso abaixo, temos um exemplo de como podemos ter um Singleton, isto é, uma classe
    que serve pra ter somente uma instância.

    Singletons são um padrão de projeto em que uma classe é constituída, basicamente, de
    constantes. Para isso, podemos usar as construções "companion object" e "object" para
    declarar atributos e métodos, os quais são usados como se fossem const.

    Caso queiramos que a classe seja uma singleton rígida, poderemos trancar o construtur,
    tornando-o privado, como pode ser visto abaixo com "private constructor()" na declaração
    do nome da classe.
 */
class Constants private constructor(){
    // Para métodos e atributos constantes
    companion object BANCO {
        const val TABLE = "Pessoa"
    }

    object VENDAS {
        val TABLE_NAME = "Vendas"

        object COLUNAS {
            val ID = "Id"
            val TOTAL = "Total"
        }
    }
}

fun main() {
    var result = Math.sin(180.0)
    Constants.BANCO.TABLE
    Constants.VENDAS.COLUNAS.ID
}