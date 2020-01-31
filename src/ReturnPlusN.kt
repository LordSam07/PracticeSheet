var x = 0

fun main(){
    println(adder())
    println(adder())
    println(adder())
    println(adder())
}

fun adder() : Int{
    x += 2
    return x
}