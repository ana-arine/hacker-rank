
//Task
//Given an integer, n, print its first 10 multiples. Each multiple n x i (where 1 <= i <= 10) should be printed
//on a new line in the form: n x i = result.

fun multiply(n: Int) {

    for (i in 1..10){
        println("$n x $i = ${n*i}")
    }

}

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    multiply(n)

}