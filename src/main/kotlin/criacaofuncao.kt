fun main () {
    println("A soma do resultado é : ${som(a = 1, b = 20)}")
    ola()
}

//com retorno

fun som (a: Int, b:Int): Int {
    val resultado = a + b
    return resultado
}

//sem retorno

fun ola (): Unit {
    println("Ola, tudo bem?")
}