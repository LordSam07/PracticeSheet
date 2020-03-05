// Complete the minimumBribes function below.
fun minimumBribes(q: Array<Int>): Unit {

    val sortedArray = q.sortedArray()
    var bribeArray = ArrayList<Int>()
    var numberOfBribes = 0
    var maxBribe = 0
    var maxTrial = 0

    //check bribe
    for (i in q.indices){
        var indexOfBribe = q.indexOf(sortedArray[i])

        if (i < indexOfBribe){
            //numberOfBribes += i - indexOfBribe
            bribeArray.add(sortedArray[i])

//            if (maxBribe < i - indexOfBribe){
//                maxBribe = i - indexOfBribe
//            }
        }
    }

    //test cases
    for (i in bribeArray.indices){
        var tempArr =  sortedArray
        for (i in bribeArray.indices){

        }
    }

    if (maxBribe <= 2){
        println(numberOfBribes)
    }else{
        println("Too chaotic")
    }


}

fun main(args: Array<String>) {

    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val q = readLine()!!.split(" ").map{ it.trim().toInt() }.toTypedArray()

        minimumBribes(q)
    }
}
