package estudoLoop

/*
 * Loop Iterator
 *
 * São as implementações que dão a capacidade de algo ser iterado (percorrer os elementos em uma determinada estrutura de dados).
 * O Kotlin dá a possibilidade de implementar operadores de iterators personalizados (criar a nossa própria implementação).
 */

fun main() {
    val animais: List<Animal> = listOf(Animal("zebra"), Animal("leão"))
    val zoologico : Zoologico = Zoologico(animais = animais)

    /*
     * Como foi dada a capacidade da classe Zoologico ser iterada, ao invés de percorrer o atributo 'animais' definida na classe
     * o loop fazemos diretamente da classe.
     */
    for (animal in zoologico) {
        println("Animal (percorrendo através do iterator definido na classe 'Zoologico'): ${animal.nome}")
    }

    println("----------------------------------------------------")

    // 2 forma do loop
    for (animal in zoologico.animais) {
        println("Animal (percorrendo a lista de animais através do atributo 'animais'): ${animal.nome}")
    }
}