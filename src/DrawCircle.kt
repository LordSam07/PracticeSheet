@Suppress("unused")
class DrawCircle {

    fun mpcga(radius :Int){
        var x = 0
        var y = radius
        var p = 1.25 - radius

        while (x < y){
            if (p < 0){
                p += 2*x + 3
                x += 1
                println("Plot($x, $y)")
            }else{
                p += 2*(x - y) + 5
                x += 1
                y -= 1
                println("Plot($x, $y)")
            }
        }
    }
}