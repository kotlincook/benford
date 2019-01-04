import java.math.BigInteger
import java.math.BigInteger.ZERO

fun factorial(n: Int): BigInteger {
    var result = BigInteger.ONE
    for (i in 2..n) result = result * i.toBigInteger()
    return result
}

fun main() {
    val frequencies = Array(10) { 0 }

    for (i in 0..3000) {
        val number = factorial(i)
        frequencies[firstDigit(number)]++
    }

    printDestribution(frequencies)
}