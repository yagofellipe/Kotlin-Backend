package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

val systUsers: MutableSet<Int> = mutableSetOf(1,2,3)
val sudoerss: Set<Int> = systUsers

fun addSystemUsers(newUser: Int){
    systUsers.add(newUser)
}

fun getSysSudoerss(): Set<Int> {
    return sudoerss
}
fun main() {
    addSystemUsers(5)
    println("${systUsers.size}")
    getSysSudoerss().forEach(){ i ->
        println(i)
    }
}