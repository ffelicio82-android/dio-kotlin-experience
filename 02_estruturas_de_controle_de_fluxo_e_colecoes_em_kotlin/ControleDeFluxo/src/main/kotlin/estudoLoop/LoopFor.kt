package estudoLoop

/*
 * Estrutura de repetição For
 */

fun main() {
    val bolos : List<String> = listOf("cenoura", "banana", "chocolate")
    val listaDeMinhaClasse : List<MinhaClasse> = listOf(
        MinhaClasse(valor = "Valor 1"),
        MinhaClasse(valor = "Valor 2"),
        MinhaClasse(valor = "Valor 3")
    )

    for(bolo in bolos) {
        println("Bacana! Hoje tem bolo de $bolo?!")
    }

    println("------------------------------------------------")

    for(minhaClasse in listaDeMinhaClasse) {
        println("O valor dentro de ${minhaClasse.javaClass.name} é ${minhaClasse.valor}")
    }
}