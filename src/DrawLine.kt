import kotlin.math.abs
import kotlin.math.round

class DrawLine {

    fun dda(x1 :Int, y1 :Int, x2 :Int, y2 :Int){
        val dx = x2 - x1
        val dy = y2 - y1
        var x = x1.toDouble()
        var y = y1.toDouble()

        val step = if (abs(dx) > abs(dy)){
            abs(dx)
        }else{
            abs(dy)
        }

        val xi = dx.toDouble() / step
        val yi = dy.toDouble() / step

        for (i in 1..step){
            x += xi
            y += yi
            println("Plot(${round(x)}, ${round(y)})")
        }
    }

    fun bresenham(x1 :Int, y1 :Int, x2 :Int, y2 :Int){
        val dx = x2 - x1
        val dy = y2 - y1
        var x = x1
        var y = y1
        var p = 2*dy - dx

        for (i in 1..dx){
            if (p < 0){
                x += 1
                println("Plot($x, $y)")
                p += 2*dy
            }else{
                x += 1
                y += 1
                println("Plot($x, $y)")
                p += 2*dy - 2*dx
            }
        }
    }
}