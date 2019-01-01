import java.math.BigInteger
import java.math.BigInteger.*

val NO_OF_DIGITS = 20
val MAX_EXPONENT = 1000
val NO_SAMPLES = 1000000


fun firstDigit(number: BigInteger) = number.toString()[0].toInt() - 48

fun printDestribution(frequencies: Array<Int>) {
    frequencies.forEachIndexed { index, elem ->
        println("$index: ${elem.toFloat() / NO_SAMPLES.toFloat()}" )
    }
}

fun randomBinary() = if (Math.random() < 0.5) ZERO else ONE

fun randomExponent() = (Math.random() * MAX_EXPONENT).toInt()

fun randomNumber(): BigInteger {
    var result = ZERO

    repeat(NO_OF_DIGITS) {
        result = result * TWO + randomBinary()
    }
    repeat(randomExponent()) {
        result *= TWO
    }
    return result
}


fun main(args: Array<String>) {

    val frequencies = Array(10) { 0 }

    repeat(NO_SAMPLES) {
        val number = randomNumber()
        if (number != ZERO) frequencies[firstDigit(number)]++
    }

    printDestribution(frequencies)

}