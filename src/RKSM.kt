// Following program is a Java implementation
// of Rabin Karp Algorithm given in the CLRS book 
object Main {
    // d is the number of characters in the input alphabet
    const val d = 256

    /* pat -> pattern
		txt -> text 
		q -> A prime number 
	*/
    fun search(pat: String, txt: String, q: Int) {
        val M = pat.length
        val N = txt.length
        var i: Int
        var j: Int
        var p = 0 // hash value for pattern
        var t = 0 // hash value for txt
        var h = 1
        // The value of h would be "pow(d, M-1)%q"
        i = 0
        while (i < M - 1) {
            h = h * d % q
            i++
        }
        // Calculate the hash value of pattern and first
// window of text 
        i = 0
        while (i < M) {
            p = (d * p + pat[i].toInt()) % q
            t = (d * t + txt[i].toInt()) % q
            i++
        }
        // Slide the pattern over text one by one
        i = 0
        while (i <= N - M) {
            // Check the hash values of current window of text
// and pattern. If the hash values match then only 
// check for characters on by one 
            if (p == t) { /* Check for characters one by one */
                j = 0
                while (j < M) {
                    if (txt[i + j] != pat[j]) break
                    j++
                }
                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == M) println("Pattern found at index $i")
            }
            // Calculate hash value for next window of text: Remove
// leading digit, add trailing digit 
            if (i < N - M) {
                t = (d * (t - txt[i].toInt() * h) + txt[i + M].toInt()) % q
                // We might get negative value of t, converting it
// to positive 
                if (t < 0) t = t + q
            }
            i++
        }
    }

    /* Driver program to test above function */
    @JvmStatic
    fun main(args: Array<String>) {
        val txt = "GEEKS FOR GEEKS"
        val pat = "GEEK"
        val q = 101 // A prime number
        search(pat, txt, q)
    }
}