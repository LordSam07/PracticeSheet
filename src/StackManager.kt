class Stack {
    var top: Int = -1
    var a = Array<String>(MAX){""} // Maximum size of Stack
    val isEmpty: Boolean
        get() = top < 0

    fun push(x: String): Boolean {
        return if (top >= MAX - 1) {
            println("Stack Overflow")
            false
        } else {
            a[++top] = x
            println("$x pushed into stack")
            true
        }
    }

    fun pop(): String {
        return if (top < 0) {
            println("Stack Underflow")
            "NIL"
        } else {
            a[top--]
        }
    }

    fun peek(): String {
        return if (top < 0) {
            println("Stack Underflow")
            "NIL"
        } else {
            a[top]
        }
    }

    companion object {
        const val MAX = 1000
    }

}




