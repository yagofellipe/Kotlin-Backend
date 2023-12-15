package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

open class Dog (val origem: String) {

    fun latir() {
        println("au au au")
    }
}

class ViraLata(origem: String): Dog(origem = origem) {

}

fun main() {
    val cachorro: Dog = ViraLata("Brasil")
    cachorro.latir()
    println(cachorro.origem)
}