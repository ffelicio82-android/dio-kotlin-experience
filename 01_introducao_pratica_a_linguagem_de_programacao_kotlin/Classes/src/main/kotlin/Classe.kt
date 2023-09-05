/*
 * Classes
 *
 * Estrutura de dados que podemos moldar de acordo com a nossa necessidade (molde para um objeto)
 *
 * Ao criar uma instância da classe, não é necessário utilizar a palavra chave "new"
 */

class Cliente(val nome: String)

// Aqui é definido um construtor personalizado
class Contato(val id: Int, var email: String, val cliente: Cliente)

fun main(args: Array<String>) {
    val cliente: Cliente = Cliente(nome = "Cliente")
    val contato: Contato = Contato(id = 1, email = "teste@teste.com", cliente = cliente)

    println(contato.id)
    println(contato.email)

    // contato.id = 1 // aqui irá dar erro porque na definição da classe, o atributo foi definido como imutável (val), ou seja, não pode reatribur valor.
    contato.email = "teste-alterado@teste.com" // funcionará normalmente a alteração devido ao atributo "email" ser mutável (var)
    println(contato.email)

    // Printando o nome do cliente vinculado com o contato
    println(contato.cliente.nome)
}