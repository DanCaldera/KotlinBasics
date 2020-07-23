fun main(args: Array<String>) {
    var a = 10
    var b = 11
    var c = 5

    if(a<b){
        println("b es mayor!")
    } else {
        println("b es menor!")
    }

    var mayor =  if (a>b && a>c) a else if (b>a && b>c) b else c

    println("El número mayor de todas mis variables es $mayor")
}