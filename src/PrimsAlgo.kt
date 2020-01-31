// number of vertices in grapj

// create a 2d array of size 5x5
//for adjacency matrix to represent graph

private val G = arrayOf(
    intArrayOf(0, 2, 5, 4),
    intArrayOf(2, 0, 1, 6),
    intArrayOf(5, 1, 0, 3),
    intArrayOf(4, 6, 3, 0)
)

private fun main(){

    var noEdge = 0 // number of edge

    // create a array to track selected vertex
    // selected will become true otherwise false
    val selected = IntArray(DefineConstants.V)

    // the number of edge in minimum spanning tree will be
    // always less than (V -1), where V is number of vertices in
    //graph

    // choose 0th vertex and make it true
    selected[0] = 1

    var x: Int //  row number
    var y: Int //  col number

    // print for edge and weight
    println("Edge : Weight")
    while (noEdge < DefineConstants.V - 1) {

        //For every vertex in the set S, find the all adjacent vertices
        // , calculate the distance from the vertex selected at step 1.
        // if the vertex is already in the set S, discard it otherwise
        //choose another vertex nearest to selected vertex  at step 1.

        var min = DefineConstants.INF
        x = 0
        y = 0

        for (i in 0 until DefineConstants.V) {
            if (selected[i] != 0) {
                for (j in 0 until DefineConstants.V) {
                    if (selected[j] == 0 && G[i][j] != 0) { // not in selected and there is an edge
                        if (min > G[i][j]) {
                            min = G[i][j]
                            x = i
                            y = j
                        }

                    }
                }
            }
        }
        println("$x - $y :  ${G[x][y]}")
        selected[y] = 1
        noEdge++
    }
}

internal object DefineConstants {
    const val INF = 9999999
    const val V = 4
}
