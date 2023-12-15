package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

class Configuration(val host: String, val port: Int)

fun main() {
    val configuration = Configuration("127.0.0.1", 9000)

    with(configuration) {
        println("${host}")
    }
    configuration.run {
        println("${host}")
    }
}