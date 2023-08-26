// A o argumento da função "main", foi removida a sua obrigatoriedade a partir da versão 1.3 da linguagem.
// Ela é muito utilizada caso haja a necessidade de passagem de algum valor para execução da classe ou script.
fun main(args: Array<String>) {
    // Mostrando o conteúdo dos argumentos passados ao executar a função
    println(message = "Usando o args: ${args.contentToString()}")

    // Informa quantidade de itens na lista de argumentos
    println("Usando o args: TAMANHO = ${args.size}")
}