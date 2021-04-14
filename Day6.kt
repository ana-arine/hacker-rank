
//Task
//Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters
//as 2 space-separated strings on a single line.

fun evenAndOdd(s: String) {

    var even = ""
    var odd = ""

    for (n in 0..s.length - 1) {
        if (n % 2 == 0) {
            even += s[n].toString()
        } else {
            odd += s[n].toString()
        }
    }
    println(even + " " + odd)
}


fun main(args: Array<String>) {

    val numPalavras = readLine()!!.toInt()
    var s: String
    var j: Int

    j = 0
    while (j < numPalavras){
        s = readLine()!!.toString()
        j++
        evenAndOdd(s)
    }

}