import java.math.BigInteger
import java.math.BigInteger.ZERO

fun main() {
    val frequencies = Array(10) { 0 }

    for (i in 0..100000) {
        val number = BigInteger.valueOf(i.toLong())
        val squared = number * number
        if (squared != ZERO) frequencies[firstDigit(squared)]++
    }

    printDestribution(frequencies)
}