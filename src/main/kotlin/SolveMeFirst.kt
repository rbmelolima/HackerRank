import java.util.*

fun solveMeFirst(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()

    if(num1 < 1 || num1 > 1000 || num2 < 1 || num2 > 1000) {
        println("Invalid input")
        return
    }

    val sum = solveMeFirst(num1, num2)
    println(sum)
}