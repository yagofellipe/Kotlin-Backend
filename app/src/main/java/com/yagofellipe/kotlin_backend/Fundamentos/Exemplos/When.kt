package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

fun main() {
    cases(12512)
    cases("Hello")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}