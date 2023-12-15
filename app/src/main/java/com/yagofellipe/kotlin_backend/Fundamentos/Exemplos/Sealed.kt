package com.yagofellipe.kotlin_backend.Fundamentos.Exemplos

/*ela pode ter subclasses, mas todas elas devem ser declaradas dentro do mesmo arquivo
onde a classe selada é definida.*/
sealed class Result {
    class Success(val value: Int) : Result()
    class Error(val message: String) : Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Success: ${result.value}")
        is Result.Error -> println("Error: ${result.message}")
    }
}

fun main() {
    val successResult: Result = Result.Success(10)
    handleResult(successResult)
}