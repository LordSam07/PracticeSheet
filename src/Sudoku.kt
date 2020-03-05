import kotlin.random.Random

class Sudoku {

    var sudokuArray = Array<Array<Int>>(9){ arrayOf(0, 0, 0, 0, 0, 0 ,0 ,0 ,0)}
    var sudokuSize = sudokuArray.size

    fun printSudoku(){
        println(sudokuSize)
        for (i in sudokuArray.indices){
            for (j in sudokuArray.indices){
                print("${sudokuArray[i][j]}  ")
            }
            println()
        }
    }

    fun makeArray(){
        val tempArr = Array(sudokuSize){0}
        var indexRow = 0
        var indexCol = 0
        var tempIndex = 0
        var countCol = 0
        var countRow = 0

        while (countRow < 9){
            while (countCol < 9){
                val ran = Random.nextInt(sudokuSize + 1)
                if (tempArr.contains(ran) || ran == 0){
                    continue
                }else{
                    tempArr[tempIndex] = ran
                    sudokuArray[indexRow][indexCol] = ran
                    indexCol++
                    tempIndex++
                    countCol++
                    printSudoku()
                }
            }
            indexCol = 0
            tempIndex = 0
            countCol = 0
            countRow++
            indexRow++
        }

    }


}

fun main(){

    val ob = Sudoku()
    ob.printSudoku()
    ob.makeArray()
    ob.printSudoku()

}