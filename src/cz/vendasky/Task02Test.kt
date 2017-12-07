package cz.vendasky

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Task02Test {

    @Test
    fun shouldParseInputToList() {
        assertEquals(listOf(listOf(5, 1, 9, 5), listOf(7, 5, 3), listOf(2, 4, 6, 8)), parseInputToList("5\t1\t9\t5\n7\t5\t3\n2\t4\t6\t8"))
    }

    @Test
    fun shouldFindChecksum() {
        assertEquals(18, findChecksum("5\t1\t9\t5\n7\t5\t3\n2\t4\t6\t8"))
    }

}