import java.math.BigInteger
import java.math.BigInteger.ZERO

fun main() {
    val frequencies = Array(10) { 0 }

    for (i in 0..700000) {
        val number = BigInteger.valueOf(i.toLong())
        val root = number.sqrt()
        if (root != ZERO) frequencies[firstDigit(root)]++
    }

    printDestribution(frequencies)
}