package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

data class Person(var name: String, var age: Int, var about: String) {
    constructor(): this("", 0, "")
}

fun writeCreationLog(p: Person) {
    println("${p.name}")
}


fun main() {
    var yago = Person("yago", 30, "Android developer")
        .also {
            writeCreationLog(it)
        }
}