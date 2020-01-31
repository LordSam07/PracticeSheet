fun main(){

    println("Enter token :")
    var token = readLine()!!
    val obj = OperatorPrecedence()
    val s = Stack()
    var arr = ArrayList<String>()
    arr = obj.sortPrecedence(token)

    for (i in arr.indices){
        s.push(arr[i])
    }

    println("${s.pop()}  Popped from stack");
    print(s.peek())
}