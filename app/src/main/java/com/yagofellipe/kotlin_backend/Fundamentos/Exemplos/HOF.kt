package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

fun calc(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main() {
    val sumResult = calc(10,3, ::sum)
}