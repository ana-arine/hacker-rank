
fun fizzBuzz(n: Int): Unit {
    // Write your code here

    //Imprime FizzBuzz para múltiplos de 3 e de 5
    //Imprime Fizz para múltiplos de 3
    //Imprime Buzz para múltiplos de 5
    //Imprime o número para o restante

    for (i in 1..n) {
        when {
            i%15 == 0 -> println("FizzBuzz")
            i%3 == 0 && i%5 != 0 -> println("Fizz")
            i%5 == 0 && i%3 != 0 -> println("Buzz")
            else -> println(i)
        }
    }
}

fun main(args: Array<String>) {
    fizzBuzz(30)
}