/*
 * Varargs
 *
 * É um tipo de parâmetro aonde se passa uma quantidade indefinida de um determinado tipo.
 * Nos exemplos abaixo é informado que o varags utilizados nas funções precisam ser do tipo String.
 * Quando é utilizado o valor de varags dentro das funções, o mesmo é tratado como uma lista (array), por isso as informações
 * são tratadas com um laço de repetição para mostrar as suas informações.
 */

fun main() {
    // O Kotlin deixa criar funções dentro de outra função
    // Isso informa que a mesma será utilizada somente no contexto da função principal
    // Não sendo possível utilizar fora da função main.
    fun mostrarTodas(vararg mensagens: String) {
        for (mensagem in mensagens) {
            println("escopo da função main: $mensagem")
        }
    }
    mostrarTodas("Salve!", "Tudo tranquilo?")

    println("----------------------------------------------------------------")

    fun mostrarTodasComPrefix(vararg mensagens: String, prefixo: String) {
        for (mensagem in mensagens) {
            println("$prefixo $mensagem")
        }
    }
    mostrarTodasComPrefix("Salve!", "Tudo tranquilo?", prefixo = "Função com prefixo (escopo da função main):")

    println("----------------------------------------------------------------")

    // Função fora do escopo da função main
    log("logando registros 1", "logando registros 2")

    println("----------------------------------------------------------------")

    // Usando objetos
    val pessoa1 = Pessoa(nome = "Pessoa 1", idade = 50)
    val pessoa2 = Pessoa(nome = "Pessoa 2", idade = 40)
    val pessoa3 = Pessoa(nome = "Pessoa 3", idade = 30)
    val pessoa4 = Pessoa(nome = "Pessoa 4", idade = 20)
    log(pessoa1, pessoa2, pessoa3, pessoa4)
}

fun log(vararg entradas: String) {
    // Se houver a necessidade de chamar uma função que também utiliza o recurso de vararg
    // vai ser preciso passar o asterisco (conforme abaixo).
    // Se não for passado, o dado vai ser passado como array.
    // Ao executar assim: mostrarTodasForaDoEscopo(entradas), será mostrado o erro:
    // Kotlin: Type mismatch: inferred type is Array<out String> but String was expected
    mostrarTodasForaDoEscopo(*entradas)
}

fun mostrarTodasForaDoEscopo(vararg mensagens: String) {
    for (mensagem in mensagens) {
        println("Função fora do escopo da função main: $mensagem")
    }
}

// Sobrescrita da função log
fun log(vararg pessoas: Pessoa) {
    for (pessoa in pessoas) {
        println("Mostrando objeto pessoa: Nome: ${pessoa.nome} | idade: ${pessoa.idade}")
    }
}



data class Pessoa(val nome: String, val idade: Int)