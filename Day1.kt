
//Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. You must:
//1. Declare 3 variables: one of type int, one of type double, and one of type String.
//2. Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your 3
//variables.
//3. Use the + operator to perform the following operations:
//
//a. Print the sum of i plus your int variable on a new line.
//b. Print the sum of d plus your double variable to a scale of one decimal place on a new line.
//c. Concatenate s with the string you read as input and print the result on a new line.


fun main(args: Array<String>) {
    val i: Int = 4
    val d: Double = 4.0
    val s: String = "HackerRank "
    //val scan = Scanner(System.`in`)
    val anotherI: Int = readLine()!!.toInt()
    val anotherD: Double = readLine()!!.toDouble()
    val anotherS: String = readLine()!!.toString()

    /* Declare second integer, double, and String variables. */

    /* Read and save an integer, double, and String to your variables.*/
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

    /* Print the sum of both integer variables on a new line. */

    /* Print the sum of the double variables on a new line. */

    /* Concatenate and print the String variables on a new line;
        the 's' variable above should be printed first. */


    println(i + anotherI)
    println("%.1f".format(d + anotherD))
    println(s + anotherS)

}
