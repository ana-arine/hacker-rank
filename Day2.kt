import kotlin.math.roundToInt

//Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
//and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
//Round the result to the nearest integer.


fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) : Unit {

    val result = (meal_cost + ((meal_cost / 100) * (tax_percent.toDouble() + tip_percent.toDouble()))).roundToInt()
    println(result)
}

fun main(args: Array<String>) {

    val meal_cost = readLine()!!.toDouble()

    val tip_percent = readLine()!!.toInt()

    val tax_percent = readLine()!!.toInt()

    solve(meal_cost, tip_percent, tax_percent)
}