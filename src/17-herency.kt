open class FruitsHerency() {

    var color: String = ""
    var flavor: String = ""
    var price: Int = 0

    constructor(color: String, flavor: String, price: Int):this(){
        this.color = color
        this.flavor = flavor
        this.price = price
    }

    fun rot(){
        println("La fruta se está pudriendo")
    }
}

class FruitsWithFat(): FruitsHerency() {
    var fatQuantity: Int = 0

    constructor(fat: Int):this(){
        this.fatQuantity = fat
    }
}

fun main() {
    var apple = Frutas("Red", "Sweet", 4, 2)
    var avocado = FruitsWithFat(10)

    avocado.color = "green"

    println(apple.color)
    println(avocado.fatQuantity)
    println(avocado.color)
    println(avocado.rot())
}