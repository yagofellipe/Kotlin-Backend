package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

// classe de tipo genérico

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()
    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
    override fun toString() = "MutableStack(${elements.joinToString() }}"
}

fun <E> mutable(vararg elementos: E) = MutableStack(*elementos)

fun main() {
    val stack = MutableStack(0.63, 3.14, 2.7)
    stack.push(9.90)
    println(stack)
}