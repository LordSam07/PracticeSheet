fun stringMatching(str :String, ptr :String){
    val n = ptr.length
    var k = 0
    var c = ""
    var d = ""
    var count = 0

        for (i in str.indices){
            if (str[i] == ptr[k]){
                d += str[i]
                c += ptr[k]
                k++
            }
            else if((c.length == n) and (c != d)){
                k = 0
                d = ""
                c = ""
            }
            if ((d == c) and (c.length == n))
            {
                count++
                k=0
                d = ""
                c = ""
            }

        }
    println(count)
}

fun main(){

    stringMatching("aabaacaadaabaaba", "aaba")

}