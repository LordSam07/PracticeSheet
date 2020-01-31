
fun countChar(str: String, x: Long): Long {
    var count :Long= 0
    for (element in str) if (element == 'a') count++
    val repetitions = x / str.length
    count *= repetitions

    for (i in 0 until x % str.length) {
        if (str[i.toInt()] == 'a') count++
    }
    return count
}

fun main(args: Array<String>) {
    val str = "a"
    println(countChar(str, 10000000000))
}
