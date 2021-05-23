package math

import kotlin.math.pow

class GeometricSequnce(
    val initialNumber: Double,
    val ratio: Double
) {
    fun getNumber(index: Int) = initialNumber * ratio.pow(index - 1)

    fun seriesSlow(index: Int) = (1..index).fold(0.0) { acc, i ->
        acc + getNumber(i)
    }

    fun seriesFast1(index: Int) = initialNumber * (ratio.pow(index) - 1) / (ratio - 1)
    fun seriesFast2(index: Int) = initialNumber * (1 - ratio.pow(index)) / (1-  ratio )
}