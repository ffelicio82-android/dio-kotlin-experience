
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

// Propaga os elementos pra classe
fun <E> mutableFilaMutavelOf(vararg elementos: E) = FilaMutavel(*elementos)

fun main(args: Array<String>) {
    val fila = mutableFilaMutavelOf<Double>(0.62, 3.14, 2.7)
    fila.push(5.0)
    println(fila)
}