class MazeRunner(var mazeSize: Int = 10) {

    var maze = ArrayList<Array<String>>()
    private val mazeWall = "+"

    fun createMaze(mazeWalls :Array<String>){

        for (e in mazeWalls){
            var i = e[0].toString().toInt()
            var j = e[1].toString().toInt()
            makeMaze()
            maze[i][j] = "_"
        }

    }

    fun printMaze(){

        for (i in 0 until mazeSize){
            for (j in 0 until mazeSize){
                print("$mazeWall  ")
            }
            println()
        }
    }

    fun makeMaze(){

        for (i in 0 until mazeSize){
            for (j in 0 until mazeSize){
               maze[i][j] = "_"
            }
        }
    }
}

fun main(){
    val walls = arrayOf("00", "01", "02")
    val ob = MazeRunner(10)
    ob.createMaze(walls)
    ob.printMaze()
}