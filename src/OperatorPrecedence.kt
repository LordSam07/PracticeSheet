class OperatorPrecedence {

    fun sortPrecedence(token: String): ArrayList<String> {
        val operatorPrecedenceArray = ArrayList<Int>()
        val operatorArray = ArrayList<String>()

        for (i in token.indices) {
            when (token[i]) {
                '/' -> operatorPrecedenceArray.add(1)
                '*' -> operatorPrecedenceArray.add(2)
                '+' -> operatorPrecedenceArray.add(3)
                '-' -> operatorPrecedenceArray.add(4)
            }
        }
        operatorPrecedenceArray.sort()

        for (j in operatorPrecedenceArray.indices) {
            when (operatorPrecedenceArray[j]) {
                1 -> operatorArray.add("/")
                2 -> operatorArray.add("*")
                3 -> operatorArray.add("+")
                4 -> operatorArray.add("-")
            }
        }
        return operatorArray
    }
}
