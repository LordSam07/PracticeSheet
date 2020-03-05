import java.lang.Exception
import kotlin.random.Random

class Puzzle(private var matrixSize :Int) {

    private var puzzleArray = Array(matrixSize){ Array(matrixSize){0} }

    fun makeArray() : Array<Array<Int>> {
        val tempArr = Array(matrixSize * matrixSize){0}
        var indexRow = 0
        var indexCol = 0
        var tempIndex = 0

        while (indexRow < matrixSize){
            while (indexCol < matrixSize){
                val ran = Random.nextInt(matrixSize * matrixSize + 1)
                if (tempArr.contains(ran)){
                    continue
                }else{
                    puzzleArray[indexRow][indexCol] = ran
                    tempArr[tempIndex] = ran
                    tempIndex++
                    indexCol++
                }
            }
            indexRow++
            indexCol = 0
        }
        findMax()
        return puzzleArray
    }

    private fun findMax() {
        var max = 0
        val maxIndex = Array(2){0}

        for (i in puzzleArray.indices){
            for (j in puzzleArray.indices){
                if (puzzleArray[i][j] > max){
                    max = puzzleArray[i][j]
                    maxIndex[0] = i
                    maxIndex[1] = j
                }
            }
        }
        puzzleArray[maxIndex[0]] [maxIndex[1]] = 0
    }

    fun play(){
        var count = 0
        do {
            println("Enter command: ")
            val input = readLine()!!
            var value = ""
            for (i in input.indices){
                if (input[i] in '1'..'9')
                    value += input[i]
            }
            var command = ""
            for (i in input.indices){
                if (input[i] in 'a'..'z')
                    command += input[i]
            }

            val indexOfZero = Array(2){0}
            val indexOfElement = Array(2){0}

            for (i in puzzleArray.indices){
                for (j in puzzleArray.indices){
                    if (puzzleArray[i][j] == 0) {
                        indexOfZero[0] = i
                        indexOfZero[1] = j
                    }}}

            for (i in puzzleArray.indices){
                for (j in puzzleArray.indices){
                    if (puzzleArray[i][j] == value.toInt()) {
                        indexOfElement[0] = i
                        indexOfElement[1] = j
                    }}}

            when (command){
                "u" -> {
                    if (puzzleArray[indexOfElement[0] - 1][indexOfElement[1]] == 0){
                    try {
                        val temp: Int = puzzleArray[indexOfZero[0]][indexOfZero[1]]
                            puzzleArray[indexOfZero[0]][indexOfZero[1]] =
                                puzzleArray[indexOfElement[0]][indexOfElement[1]]
                            puzzleArray[indexOfElement[0]][indexOfElement[1]] = temp
                            printArr()
                    }catch (ex :Exception){
                        println("Not Allowed")
                    }
                    } else {
                        println("Not Allowed")
                    }
                }

                "d" -> {
                    if (puzzleArray[indexOfElement[0] + 1][indexOfElement[1]] == 0){
                        try {
                            val temp: Int = puzzleArray[indexOfZero[0]][indexOfZero[1]]
                            puzzleArray[indexOfZero[0]][indexOfZero[1]] =
                                puzzleArray[indexOfElement[0]][indexOfElement[1]]
                            puzzleArray[indexOfElement[0]][indexOfElement[1]] = temp
                            printArr()
                        }catch (ex :Exception){
                            println("Not Allowed")
                        }
                    } else {
                        println("Not Allowed")
                    }
                }

                "l" -> {
                    if (puzzleArray[indexOfElement[0]][indexOfElement[1] - 1] == 0){
                        try {
                            val temp: Int = puzzleArray[indexOfZero[0]][indexOfZero[1]]
                            puzzleArray[indexOfZero[0]][indexOfZero[1]] =
                                puzzleArray[indexOfElement[0]][indexOfElement[1]]
                            puzzleArray[indexOfElement[0]][indexOfElement[1]] = temp
                            printArr()
                        }catch (ex :Exception){
                            println("Not Allowed")
                        }
                    } else {
                        println("Not Allowed")
                    }
                }

                "r" -> {
                    if (puzzleArray[indexOfElement[0]][indexOfElement[1] + 1] == 0){
                        try {
                            val temp: Int = puzzleArray[indexOfZero[0]][indexOfZero[1]]
                            puzzleArray[indexOfZero[0]][indexOfZero[1]] =
                                puzzleArray[indexOfElement[0]][indexOfElement[1]]
                            puzzleArray[indexOfElement[0]][indexOfElement[1]] = temp
                            printArr()
                        }catch (ex :Exception){
                            println("Not Allowed")
                        }
                    } else {
                        println("Not Allowed")
                    }
                }
            }

            //winning conditions
            for (i in puzzleArray.indices ){
                for (j in 0..puzzleArray.size - 2){
                    if (puzzleArray[i][j] > puzzleArray[i][j+1])
                        count++
                }
            }

            if (count != matrixSize * matrixSize)
                count = 0

        }while (count < matrixSize * matrixSize)
    }

    fun printArr(){
        for (i in puzzleArray.indices){
            for (j in puzzleArray.indices){
                if (puzzleArray[i][j] in 1..9){
                    print("${puzzleArray[i][j]}  ")
                }else{
                print("${puzzleArray[i][j]}  ")
            }}
            println()
        }
    }

}

fun main(){
    val ob = Puzzle(3)
    ob.makeArray()
    ob.printArr()
    ob.play()
}