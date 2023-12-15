package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

infix fun Int.soma(outroNum: Int): Int {
    return this + outroNum
}

fun main() {
    val resultado = 5 soma 3
    println(resultado)

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Hello ")
}