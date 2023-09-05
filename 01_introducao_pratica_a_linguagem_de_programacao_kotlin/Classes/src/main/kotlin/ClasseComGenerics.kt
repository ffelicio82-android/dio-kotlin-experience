/*
 * Classe com Generics
 *
 * A letra que está assim <E> indica que pode ser qualquer tipo.
 */

class FilaMutavel<E>(vararg itens: E) {
    private val elementos : MutableList<E> = itens.toMutableList()

    fun push(elemento : E) = elementos.add(elemento)

    fun peek() : E = elementos.last()

    fun pop() : E = elementos.removeAt(elementos.size - 1)

    fun estahVazio() : Boolean = elementos.isEmpty()

    fun size() : Int = elementos.size

    override fun toString(): String {
        return "FilaMutavel(${elementos.joinToString()})"
    }
}

fun main() {
    val fila = FilaMutavel(0.62, 3.14, 2.7)
    fila.push(5.0)

    println(fila)

    // A linha abaixo dará erro.
    // Como o Kotlin já inferiu o tipo dos dados de acordo com o que foi criado acima,
    // dará erro porque o Kotlin já definiu que a lista dos dados deverá ser do tipo "Double"
    // filaMutavel.push("Texto")

    // O método peek retorna o elemento que está no topo da lista passada
    println("peek(): ${fila.peek()}")

    // mostra que não teve alteração da fila
    println(fila)

    // remove os itens da filas
    for (i in 1..fila.size()) {
        println("pop(): ${fila.pop()}")
        println(fila)
    }

    println(fila.estahVazio())

    val filaString = FilaMutavel("A", "B", "C")
    filaString.push("D")

    println(filaString)
    println("peek(): ${filaString.peek()}")
    println(filaString)

    // remove os itens da filas
    for (i in 1..filaString.size()) {
        println("pop(): ${filaString.pop()}")
        println(filaString)
    }

    println(filaString.estahVazio())
}