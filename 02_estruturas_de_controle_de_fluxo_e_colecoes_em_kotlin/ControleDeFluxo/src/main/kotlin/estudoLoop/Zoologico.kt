package estudoLoop

class Zoologico(val animais : List<Animal>) {
    // a função/o método abaixo dá a classe a capacidade de ser iterada
    // para funcionar, tem que respeitar a assinatura conforme descrita (utilizando a palavra chave 'operator' e o nome do método 'iterator').
    operator fun iterator() : Iterator<Animal> {
        return animais.iterator()
    }
}