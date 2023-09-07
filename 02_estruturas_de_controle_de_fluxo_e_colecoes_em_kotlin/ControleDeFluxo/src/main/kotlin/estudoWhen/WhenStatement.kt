package estudoWhen

/*
 * When
 *
 * Pode ser usado no lugar de estrutura de switch
 * Usada com statement e expressão
 */

fun main() {
    casos(objeto = 1) // irá mostrar o valor 'Um'
    casos(objeto = "Olá") // irá mostrar o valor 'É uma Saudação'
    casos(objeto = 0L) // irá mostrar o valor 'é um número Long'
    casos(objeto = MinhaClasse()) // irá mostrar o valor 'Não é uma string'

    /*
     * irá mostrar o valor 'Argumento Desconhecido'.
     * Por mais que seja a mesma label de 'Olá', não irá cair na verificação que mostra 'É uma Saudação',
     * isso é devido a consideração do case sensitive (diferença entre letras maiúsculas e minúsculas por exemplo)
     */
    casos(objeto = "olá")
}

// O Any indica que pode receber qualquer coisa (como se fosse o object - Java / C#)
fun casos(objeto: Any) {
    when(objeto) {
        1 -> println("Um")
        "Olá" -> println("É uma Saudação")
        is Long -> println("é um número Long")
        !is String -> println("Não é uma string")
        else -> println("Argumento Desconhecido") // opcional. Similar ao 'default' do switch case
    }
}