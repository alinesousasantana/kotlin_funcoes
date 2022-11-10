//funções em uma única linha\\

fun main () {
    val resultado = sub(one = 1, two = 2)
    println(resultado)
    hi()
    println("O percapital do BR é : ${percapital(PIB = 1.869000000000f, Per = 211.000000f)}")
}

fun sub (one: Int, two: Int) = one + two

fun hi () = println("Hi, nice to meet you")

fun percapital (PIB: Float, Per: Float) = PIB/Per