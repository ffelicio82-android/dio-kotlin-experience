import br.com.teste.fernando.MinhaClasse

/*
 * When Expression
 *
 *
 */

fun main() {
    println(whenAtribuido(objeto = 1))
    println(whenAtribuido(objeto = "Olá"))
    println(whenAtribuido(objeto = 2L))
    println(whenAtribuido(objeto = 2.0))
    println(whenAtribuido(objeto = MinhaClasse()))
    println(whenAtribuido(objeto = "olá"))
}

fun whenAtribuido(objeto: Any) : Any {
    // atribui o resultado do 'when' na variável resultado para devolver para quem chamou
    val resultado : Any = when(objeto) {
        1 -> "número 'um'"
        "Olá" -> "É uma Saudação"
        is Long -> objeto * 4
        is Double -> objeto.plus(0.1)
        !is String -> objeto.javaClass.canonicalName
        else -> "Argumento Desconhecido"
    }

    return resultado
}