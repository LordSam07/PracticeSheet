class StringToBinary {
    fun convertSTB(string :String) :String{
        var ascii = ""
        val strObj = StringLibrary
        for (chars in string){
            if (strObj.strASCII.containsKey(chars)){
                ascii += strObj.strASCII[chars] + " "
            }
        }
        return ascii
    }

    object StringLibrary{
        val strASCII = mapOf(
            'a' to "01100001",
            'b' to "01100010",
            'c' to "01100011",
            'd' to "01100100",
            'e' to "01100101",
            'f' to "01100110",
            'g' to "01100111",
            'h' to "01101000",
            'i' to "01101001",
            'j' to "01101010",
            'k' to "01101011",
            'l' to "01101100",
            'm' to "01101101",
            'n' to "01101110",
            'o' to "01101111",
            'p' to "01110000",
            'q' to "01110001",
            'r' to "01110010",
            's' to "01110011",
            't' to "01110100",
            'u' to "01110101",
            'v' to "01110110",
            'w' to "01110111",
            'x' to "01111000",
            'y' to "01111001",
            'z' to "01111010"
        )
    }
}

fun main(){
    val obj = StringToBinary()
    println(obj.convertSTB("sam"))
}
