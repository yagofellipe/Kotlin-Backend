package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye")
}