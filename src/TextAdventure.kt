class TextAdventure {
    fun play(name :String){
        var select = ""
        val inp = Input()

        print("""The adventure begins at at Ashoka college, 
it was my first day at the college everything and everyone was new. 
It was all up to me to build my future.
        """.trimMargin())
        print("\n\n")

        print("""I saw a girl sitting alone so, i approached her as i wanted to make new friends.""")
        print("\n\n")

        select = inp.input("""Choose an action :
            |a. Hi, Im $name.
            |b. Hi, can i sit here.
            |c. Just sit without asking.
        """.trimMargin())
        print("\n")

        when (select){
            "a" -> println("Payal :Hello, im Payal.")
            "b" -> println("Payal :Umm...Sure.")
            "c" -> println("Payal :Hi!")
        }
    }
}

fun main(){
    val game = TextAdventure()
    game.play("Sam")
}