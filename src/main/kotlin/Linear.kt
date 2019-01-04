import java.math.BigInteger
import java.math.BigInteger.ZERO

fun main() {
    val frequencies = Array(10) { 0 }

    for (i in 0..100000) {
        val number = BigInteger.valueOf(i.toLong())
        if (number != ZERO) frequencies[firstDigit(number)]++
    }

    printDestribution(frequencies)
}