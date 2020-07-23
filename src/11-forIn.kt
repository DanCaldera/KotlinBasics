fun main(args: Array<String>) {
    for (i in 1..10) {
        println("Esta es la vez número $i que entro al bloque de códido")
    }

    for ((i,v) in (4..8).withIndex()) {
        println("Esta es la vez número ${i+1} que entro al bloque de códido con el valor de $v")
    }
}