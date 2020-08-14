class Frutas() {

    var color: String = ""
    var flavor: String = ""
    var price: Int = 0
    var numLeaves: Int = 0

    constructor(color: String, flavor: String, price: Int):this(){
        this.color = color
        this.flavor = flavor
        this.price = price
    }

    constructor(color: String, flavor: String, price: Int, numLeaves:Int):this(){
        this.color = color
        this.flavor = flavor
        this.price = price
        this.numLeaves = numLeaves
    }

    fun rot(){
        println("La fruta se está pudriendo")
    }
}

fun main() {
    var appleWithLeaves = Frutas("Red", "Sweet", 4, 2)
    var appleWithoutLeaves = Frutas("Red", "Sweet", 2)

    println(appleWithLeaves.numLeaves)

    appleWithoutLeaves.rot()
}