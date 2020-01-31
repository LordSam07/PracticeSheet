
fun main(){
    val jsonString = """
    {
       "type":"Foo",
       "color":"Red",
       "data":[
          {
             "id":1,
             "title":"Hello"
          },
          {
             "id":2,
             "title":"World"
          }
       ],
       "food":"potato"
    }        
"""

    val obj = JSON(jsonString)
    val str = obj.read()
    println(str)
    //fetch the key of jason object
    val result = obj.getJSONObject(str, "data")

    //fetch the key of json object in the array
    val arrObject = obj.getJSONObject(result, "title")
    println(arrObject)
}

class JSON(private var jsonString: String) {
    fun read() :String{
        var finalString = ""

        for (element in jsonString){
            if (element == ' ' || element == '\n'){
                //element == ' ' -> To avoid spaces
                //element == '\n' -> To avoid next line
                continue
            }else {
                finalString += element
            }
        }

        return finalString
    }

    fun getJSONObject(jsonString: String, jsonObject :String) :String{
        var j = 0
        var currentIndex = 0
        var finalObject = ""
        var result = ""

        //finding the JSONObject in the JSONString
        for (i in jsonString.indices){
            currentIndex = i
            if (jsonString[i] == jsonObject[j]){
                finalObject += jsonString[i]
                j++
                if (finalObject == jsonObject)
                    break
            }else{
                finalObject = ""
                j = 0
            }
        }
//        if (jsonObject == finalObject){
//            println("found")
//        }else{
//            println("Not Found")
//        }
        //println(finalObject)
        //println(currentIndex)

        if (jsonString[currentIndex + 3] == '"'){
            result = getString(currentIndex, jsonString)
            //println(result)
        }
        if (jsonString[currentIndex + 3] == '['){
            result = getArray(currentIndex, jsonString)
            //println(result)
        }

        return result
    }

    private fun getString(index :Int, jsonString: String) :String{

        var countQuote = 0
        var finalString = ""
        var i = index + 3

            //If value is a string
            do {
                if (jsonString[i] == '"'){
                    countQuote++
                }else{
                    finalString += jsonString[i].toString()
                }
                i++
            } while (countQuote < 2)

        return finalString
    }

    private fun getArray(index: Int, jsonString :String) :String{
        var i = index + 4
        var finalArray = ""

        do {
            finalArray += jsonString[i].toString()
            i++
        } while (jsonString[i] != ']')

        return finalArray
    }

}