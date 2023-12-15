package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

enum class State {
    IDLE, RUNNING, FINISHED
}

fun main() {

    val state = State.RUNNING
    val message = when(state) {
        State.RUNNING -> "running"
        State.FINISHED -> "finished"
        State.IDLE -> "IDLE"
    }
    println(message)
}