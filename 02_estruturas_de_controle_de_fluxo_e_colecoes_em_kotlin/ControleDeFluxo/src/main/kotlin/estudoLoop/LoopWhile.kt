package estudoLoop

/*
 * While <- faz a condição sempre em primeiro
 * Do/While <- faz a condição do 'do' primeiro antes de fazer o 'while'
 *
 * Estrutura de repetição onde o mesmo é percorrido mediante uma condição de iteração
 */

fun comerUmBolo() = println("Comer um bolo")
fun assarUmBolo() = println("Assar um bolo")

fun main() {
    var bolosComidos : Int = 0
    var bolosAssados : Int = 0

    while (bolosComidos < 5) { // verifica se a quantidade de bolos comidos é menor que 5, enquanto for verdadeiro ficará rodando a instrução dentro do seu bloco
        comerUmBolo()
        bolosComidos++ // incrementa o valor de bolosComidos
    }

    println("--------------------------------")

    do {
        assarUmBolo()
        bolosAssados++ // incrementa o valor de bolosAssados
    } while (bolosAssados < bolosComidos)
}