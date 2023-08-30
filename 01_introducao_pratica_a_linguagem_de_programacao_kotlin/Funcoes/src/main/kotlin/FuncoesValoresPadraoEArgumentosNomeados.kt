
// criando a função e informando o tipo de retorno (Unit = void no Java)
fun mostrarMensagem(mensagem: String) : Unit {
    println(mensagem)
}

// criando a função e não informando o tipo de retorno
// como o retorno não é informado, implicitamente será utilizado o Unit
// como mostrado na função abaixo, o prefixo já possui um valor padrão
// caso o mesmo não seja sobrescrito, será utilizado o valor padrão definido
fun printarMensagemComPrefixo(mensagem: String, prefixo: String = "Info") {
    println("[$prefixo] $mensagem") // interpolação (concatenação)
}

// informando o tipo de retorno
fun somar(x: Int, y: Int) : Int {
    return x + y
}

// implicitamente será informado que será devolvido um inteiro
fun multiplicar(x: Int, y: Int) = x * y

fun main(args: Array<String>) {
    mostrarMensagem("Teste (Não informando o parâmetro nomeado)")
    mostrarMensagem(mensagem = "Teste (Informando o parâmetro nomeado)")

    printarMensagemComPrefixo("Teste (Não informando o parâmetro nomeado e utilizando o prefixo padrão)")
    printarMensagemComPrefixo(
        mensagem = "Teste (Informando o parâmetro nomeado e utilizando o prefixo alterado)",
        "valor do prefixo alterado"
    )

    // Como visto na definição da função o argumento "mensagem" vem antes do argumento "prefixo"
    // como está sendo utilizado o recurso de parâmetro nomeado, a ordem de utilização ficará a critério do desenvolvedor
    printarMensagemComPrefixo(
        prefixo = "alterando a ordem dos argumentos",
        mensagem = "Teste (Informando o parâmetro nomeado e utilizando o prefixo alterado em outra ordem de utilização)"
    )

    /*
     * A palavra reservada "val" informa que a variável será imutável, ou seja,
     * a mesma será criada um vez com um valor e depois a mesma não poderá ter seu valor sobrescrito
     * val imutavel : Int = 1
     * imutavel = 2 // aqui será informado que a variável não poderá sofrer alteração
     *
     * A palavra reservada "var" informa que a variável será mutável, ou seja,
     * a mesma será criada um vez com um valor e depois a mesma poderá ter seu valor sobrescrito
     * var mutavel : Int = 1
     * imutavel = 2
     */

    // Na variável abaixo é informado o seu tipo explicitamente
    val valoresSomados1: Int = somar(10, 20)
    println("Valores somados [1] (sem parâmetros nomeados) = $valoresSomados1")

    // Na variável abaixo não é informado o seu tipo.
    // O mesmo será definido implicitamente através do retorno da função
    val valoresSomados2 = somar(x = 20, y = 10)
    println("Valores somados [2] (com parâmetros nomeados) = $valoresSomados2")

    // criando a variável com "var"
    var valoresMultiplicados: Int = multiplicar(10, 10)
    println("Valores multiplicados [1] (com parâmetros nomeados) = $valoresMultiplicados")

    // como a variável foi definida com "var", a mesma poderá ser reatribuída
    valoresMultiplicados = multiplicar(x = 10, y = 10)
    println("Valores multiplicados [2] (com parâmetros nomeados) = $valoresMultiplicados")
}