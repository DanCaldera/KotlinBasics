class Fruits(color: String, flavor: String, price: Int) {

    var color: String = ""
    var flavor: String = ""
    var price: Int = 0

    fun rot(){
        println("La fruta se está pudriendo")
    }
}

fun main() {
   var manzana = Fruits("Red", "Sweet", 4)
    println(manzana.color)
    manzana.rot()
}