fun main(args: Array<String>) {
    var nombre: String = "Daniel"
    var dinero: Int = 10

    var cadena: String = "Daniel\n\tCaldera -> Ejemplo secuencia de escape"

    var cadena2: String = """Hola que tal,
        |Este es un textazo para probar el string puro
    """.trimMargin()

    println(cadena)
    println(cadena.length)
    println(cadena2)
    println(cadena + cadena2)
    println("Mi nombre es ${nombre} y tiene ${'$'+dinero.toString()} dólares")
}