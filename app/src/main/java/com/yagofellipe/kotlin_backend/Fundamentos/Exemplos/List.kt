package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

val systemUsers: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = systemUsers

fun addSystemUser(newUser: Int){
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}
fun main() {
    addSystemUser(5)
    println("${systemUsers.size}")
    getSysSudoers().forEach(){ i ->
        println(i)
    }
}