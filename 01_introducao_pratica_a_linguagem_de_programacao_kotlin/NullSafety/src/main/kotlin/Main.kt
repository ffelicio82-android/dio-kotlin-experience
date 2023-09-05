/*
 * Null safety
 */

fun main() {
    var nuncaPodeSerNula: String = "Não pode ser nula"
    // nuncaPodeSerNula = null // aqui vai dar erro porque a variável não pode receber a atribuição de nulo (erro Null can not be a value of a non-null type String)

    var podeSerNula: String? = "Pode manter a nulabilidade aqui" // O interrogação na frente do tipo, indica que pode atribuir nulo para a variável
    podeSerNula = null

    var nuncaPodeSerNulaInferido = "O compilador assume que não é nula"
    // nuncaPodeSerNulaInferido = null // aqui vai dar erro porque a variável não pode receber a atribuição de nulo (erro Null can not be a value of a non-null type String)

    fun totalLetras(naoNula : String) : Int {
        return naoNula.length
    }

    fun totalLetras(nula : String?) : Int {
        // Ao utilizar da forma abaixo, mostrará o erro: "Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?"
        // Como o Kotlin possui um controle muito forte sobre possíveis problemas de Null Pointer (muito comum em Java), é necessário tratar o dado antes de utilizar
        // "nula?".length -> executa somente se o valor não estiver nulo
        // "nula!!".length -> indica ao Kotlin que é realmente não nula. Essa instrução diz assim: "Eu, desenvolvedor, te informo que essa variável não é nula"
        // return nula.length ?: 0

        // A instrução abaixo realiza uma verificação para saber se a variável está nula.
        // Ao chamar a instrução assim "nula?.length", informa ao Kotlin executar somente se o valor não estiver nulo.
        // Caso não estiver, executará a instrução que conta a quantidade de caracteres da variável, caso contrário, retornará zero.
        // A forma abaixo de verificação se chama "Élvis operator".
        return nula?.length ?: 0
    }

    val total = totalLetras(naoNula = nuncaPodeSerNula)
    println("Total de letras (não nulo): $total")

    val total2 = totalLetras(nula = podeSerNula) // aqui vai dar erro porque a função não recebe um valor nulo
    println("Total de letras (nulo): $total2")

    fun descreverString(talvezUmaString : String?) : String {
        if(!talvezUmaString.isNullOrEmpty()) {
            return "Quantidade de caracteres: ${talvezUmaString.length}"
        }

        return "Variável 'talvezUmaString' está nula ou vazia"
    }

    println(descreverString(talvezUmaString = "Valor não nulo"))
    println(descreverString(talvezUmaString = null))
    println(descreverString(talvezUmaString = ""))
}