fun main () {
    val str = "Kotlin"
    println("o tamanho da string: ${str.length}")

    println(" a posição da string é : ${str[0]}")
    println(str.startsWith(prefix = "Ko"))
    println(str.endsWith(suffix = "n"))
    println(str.substring(startIndex = 2, endIndex = 4))
    println(str.replace(oldValue = "Kotlin", newValue = "Java"))
    println(str.lowercase())
    println(str.uppercase())
    println("                            JESUS TE AMO        ".trim())
}