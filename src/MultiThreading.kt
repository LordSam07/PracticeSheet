import java.lang.Exception
import java.util.concurrent.ThreadLocalRandom

fun main(args :Array<String>){
    var t1 = userThread("Sam")
    var t2 = userThread("Payal")
    var t3 = userThread("Devil")
    t1.start()


    t2.start()


    t3.start()
}

class userThread :Thread{
    var threadName :String? = null

    constructor(threadName :String) :super(){
        this.threadName = threadName
    }

    override  fun run(){
        //thread space
        var count = 0

        while (count < 10){
            println("Thread $threadName count :$count")
            count++
        }

        try {
            Thread.sleep(1000)
        }catch (ex :Exception){
            print(ex.message)
        }


    }
}
