enum class Prioridade1 {
    BAIXA,
    MEDIA,
    ALTA
}

enum class Prioridade2(val id: Int) {
    BAIXA(1) {
        override fun toString(): String {
            return "Super Baixa"
        }
    },
    MEDIA(2),
    ALTA(3)
}

fun main() {
    for(p in Prioridade2.values()) {
        println("$p - ${p.id} - ${p.ordinal}")
    }
}