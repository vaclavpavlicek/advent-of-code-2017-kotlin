package cz.vendasky

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Task01Test {

    @Test
    fun shouldAddDigitsWhichAreSameAsNextToSum() {
        assertEquals(3, sumOfDigits("1122"))
        assertEquals(4, sumOfDigits("1111"))
    }

    @Test
    fun shouldAddDigitsWhichAreAtTheBeggingAndAtTheEnd() {
        assertEquals(9, sumOfDigits("91212129"))
    }

}