import kotlin.Array

object Array6x6{
    var arr = arrayOf(arrayOf(-1, -1, 0, -9, -2, -2),
                      arrayOf(-2, -1, -6, -8, -2, -5),
                      arrayOf(-1, -1, -1, -2, -3, -4),
                      arrayOf(-1, -9, -2, -4, -4, -5),
                      arrayOf(-7, -3, -3, -2, -9, -9),
                      arrayOf(-1, -3, -1, -2, -4, -5))
}

fun maxHourGlass(arr: Array<Array<Int>>){
    var i = 0
    var j = 0
    var value = -999999
    var sum = 0

    while (i + 2 < 6){
        while (j + 2 < 6){
            println("${arr[i][j + 0]}  ${arr[i][j + 1]}  ${arr[i][j + 2]} ")
            println("    ${arr[i + 1][j + 1]} ")
            println("${arr[i + 2][j + 0]}  ${arr[i + 2][j + 1]}  ${arr[i + 2][j + 2]} ")
            //println()

            //calculating max hourGlass
            sum = ( arr[i][j + 0] + arr[i][j + 1] + arr[i][j + 2] +
                    arr[i + 1][j + 1] +
                    arr[i + 2][j + 0] + arr[i + 2][j + 1] + arr[i + 2][j + 2] )
            println("sum :$sum")
            println()

            if (sum >= value) value = sum
            j++
        }
        i++
        j=0
    }
    println("Max Value :$value")
}

fun main(){
    var ob = Array6x6
    maxHourGlass(ob.arr)
}
