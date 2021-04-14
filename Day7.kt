
//Task
//Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.


fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    var a = readLine()!!.split(" ")


    print(a.asReversed().toString().replace(",", "").replace("[", "").replace("]", ""))

}
