/*
 * Variáveis
 *
 * var = variável mutável - o valor pode ser reatríbuido, mas deve ser do mesmo tipo
 * val = variável imutável - o valor não pode ser reatríbuido
 *
 * Observação
 * Na criação das variáveis, dar preferência ao uso do "val".
 * O "var" seria somente utilizado se tiver a certeza que o dado dentro da variável irá mudar.
 */

fun main() {
    println("--------------------------------")
    // O Kotlin trabalha com inferência de tipo, ou seja, o tipo não precisa ser explicitamente informado
    // quando uma variável é definida, o Kotlin irá infefir o tipo de acordo com o valor atribuído para a variável
    var a = "valor inicial de a" // irá inferir o tipo String
    println(a)

    a = "Trocando valor de 'a'"
    println(a)

    // a = 10 // <- assim não poderá ser redefinido. Como o Kotlin já inferiu o valor quando a variável foi criada, a mesma não pode receber um outro tipo de valor

    println("--------------------------------")

    var b : String = "valor inicial de 'b'" // Passando explicitamente o tipo da variável
    println(b)

    println("--------------------------------")

    val c = "valor inicial de 'c'" // Irá inferir o tipo String
    println(c)

    // O valor de 'c' não pode ser redefinido
    // Como o mesmo foi criado como 'val', não poderá ser trocado o valor.
    // O mesmo funcionaria como uma constante.
    // c = "Trocando valor de 'c'" // Será mostrado o erro: Kotlin: Val cannot be reassigned

    println("--------------------------------")

    val d : String = "valor inicial de 'd'" // Passando explicitamente o tipo da variável
    println(d)

    println("--------------------------------")

    // Abaixo é mostrada uma outra forma de inicialização da variável
    // Conforme mostrado, a variável 'e' não está sendo atribuída diretamente, mas o valor será reatribuída em algum dado momento.
    // A estrutura condição irá garantir que haverá a inclusão do valor na varriável.
    val e : Int

    // Aqui será informado erro porque a variável ainda não foi inicializada.
    // Será informado que a variável deverá ter o valor definido.
    // println(e)

    if(algumaCondicao()) {
        e = 1
    } else {
        e = 2
    }

    println(e)
}

fun algumaCondicao() : Boolean = true