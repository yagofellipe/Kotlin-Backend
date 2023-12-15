package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

fun main() {
    val multi: (Int, Int) -> Int = {a, b -> a * b}
    println(multi(3, 2))
}