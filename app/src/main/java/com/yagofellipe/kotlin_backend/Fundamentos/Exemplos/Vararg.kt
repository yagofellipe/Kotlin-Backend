package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

fun main() {

    fun printAll(vararg messages: String) {
        for (message in messages) {
            println(message)
        }
    }

    printAll("oi","ola")

}