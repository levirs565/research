package math

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class GeometricSequnceTest : FunSpec({
    val doubleTolerance = 0.1
    listOf(0.1, 0.5, 2.0, 5.0).forEach {
        test("GeometricSequence with ratio $it") {
            val sequence = GeometricSequnce(1.0, it)
            for (i in 1..10) {
                val slow = sequence.seriesSlow(i)
                val fast1 = sequence.seriesFast1(i)
                val fast2 = sequence.seriesFast2(i)
                fast1 shouldBe(slow plusOrMinus doubleTolerance)
                fast2 shouldBe(fast1 plusOrMinus doubleTolerance)
            }
        }
    }
})
