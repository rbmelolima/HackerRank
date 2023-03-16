import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.math.roundToLong
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    var qtdPositive: Int = 0
    var qtdNegative: Int = 0
    var qtdZero: Int = 0

    for (i in arr.indices) {
        if(arr[i] == 0) {
            qtdZero += 1
        }
        else if (arr[i] > 0)  {
            qtdPositive++
        }
        else {
            qtdNegative++
        }
    }

    println("%.6f".format(qtdPositive.toDouble() / arr.size))
    println("%.6f".format(qtdNegative.toDouble() / arr.size))
    println("%.6f".format(qtdZero.toDouble() / arr.size))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    if(n <= 0 || n > 100) {
        return;
    }

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
