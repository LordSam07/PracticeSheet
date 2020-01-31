class Input {
    fun input(msg: String = "") :String{
        print("$msg ")
        return readLine()!!
    }
}

fun main(){
    val ob = Input()
    var q = ob.input("nssvfavv ")
    print(q)
}
