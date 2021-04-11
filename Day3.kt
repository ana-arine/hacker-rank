
//Given an integer, n, perform the following conditional actions:
//
//If n is odd, print Weird
//If n is even and in the inclusive range of 2 to 5, print Not Weird
//If n is even and in the inclusive range of 6 to 20, print Weird
//If n is even and greater than 20, print Not Weird
//
//Complete the stub code provided in your editor to print whether or not n is weird.


fun weirdOrNot(n: Int) {

        if (n % 2 != 0 || n in 6..20) {
           println("Weird")
        } else {
            println ("Not Weird")
        }

}

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    weirdOrNot(n)

}
