class SwapSort{
    fun swap(arr :Array<Int>) :Array<Int>{
        var temp = 0
        var right = arr.size - 1
        for (j in 0..arr.size/2) {
            for ((left, i) in (0 until arr.size / 2).withIndex()) {
                if (arr[right] < arr[left]) {
                    temp = arr[right]
                    arr[right] = arr[left]
                    arr[left] = temp
                    right--
                }
            }
        }
        return arr
    }
}

fun main(){
    val ob = SwapSort()
    val arr = arrayOf(5,8,3,7)
    val newArr = ob.swap(arr)

    for (e in newArr.indices){
        print(newArr[e])
    }
}
