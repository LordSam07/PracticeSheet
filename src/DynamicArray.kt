fun main() {

    var arr = Array<Int>(2) { 0 }
    var input: Int = 9999
    var count = 0
    var index = 0
    var action = "default"

    do {

        println("Enter action!")
        action = readLine().toString()

        when (action) {
            "ADD" -> {
                do {
                    if (count >= arr.size) {
                        arr = doubleArray(arr, arr.size)
                    } else {
                        println("Enter input value!")
                        input = readLine()!!.toInt()
                        count++
                        arr[index] = input
                        index++
                    }

                } while (input != 0)
            }

            "Del" -> {
                //innovation pending

            }
        }

        for (element in arr) {
            println(element)
        }

    }while (action != "END")
}

fun doubleArray(arr :Array<Int>, currentArrSize :Int) :Array<Int>{

    println("Duplicating Array!")
    var tempArray = Array<Int>(currentArrSize * 2){0}

    for (i in arr.indices){
        tempArray[i] = arr[i]
    }

    return tempArray
}
