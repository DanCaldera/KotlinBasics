import kotlin.math.cos

fun main(args: Array<String>) {
    var resultado: Int = suma(10,20)

    var cosenoUno = cos(1.0)

    println(resultado)
    println(cosenoUno)
}

fun suma(a: Int, b: Int): Int {
    return a+b
}