fun main(args: Array<String>) {

    val calificacion = 3
    val resena: String

    when (calificacion) {
        1 -> resena = "No me gustó la comida, me causó nauseas"
        1,2,3 -> { println("El cliente calificó con 3 estrellas")
             resena = "Mediocre"}
        in 4..5 -> resena = "La mejor comida mexicana que he comido en mucho tiempo"
        else -> resena = "Reseña mal escrita"
    }

    print(resena)

}