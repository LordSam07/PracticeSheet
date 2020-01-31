class SortAlgos {

    fun bubbleSort(arr :Array<Int>, size :Int){

        var temp = 0
        for (i in 0 until size){
            for (j in 0 until size - i){
                if (arr[j] > arr[j+1]){
                    temp = arr[j]
                    arr[j] = arr[j+1]
                    arr[j+1] = temp
                }
            }
        }

        for (k in 0 until size+1)
        println(arr[k])

    }

    fun selectionSort(arr :Array<Int>,size :Int = arr.size -1){

        var temp = 0
        for (i in 0 until size){
            var min = i
            for (j in i + 1 until size+1){
                if (arr[j] < arr[min]){
                    temp = arr[j]
                    arr[j] = arr[min]
                    arr[min] = temp
                }
            }
        }

        for (k in 0 until size+1)
            println(arr[k])

    }


}