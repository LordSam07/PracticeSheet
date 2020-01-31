fun main(){

    val arr = arrayOf(1, 2 , 3, 4, 5, 6)
    val newArr: Array<Int>
    val command = readLine().toString()
    val shift = command.slice(indices = 3..3).toInt()
    val rotate = command.slice(indices = 0..2)
    var low = shift
    val high = arr.size - low
    val lowArr = Array(low){0}
    val highArr = Array(high){0}

    when (rotate){
        "LTR" -> {
            for (i in lowArr.indices){
                lowArr[i] = arr[i]
            }

            for (j in highArr.indices){
                highArr[j] = arr[low++]
            }

            newArr = highArr + lowArr

            for (j in newArr.indices){
                println(newArr[j])
            }
        }

        "RTL" -> {
            for (j in lowArr.indices){
                lowArr[j] = arr[j]
            }

            for (i in highArr.indices){
                highArr[i] = arr[low++]
            }

            newArr = highArr + lowArr

            for (k in newArr.indices){
                println(newArr[k])
            }
        }

        else -> print("Enter Valid Command!")

    }


}