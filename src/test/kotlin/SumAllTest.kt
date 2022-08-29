import kotlin.test.*

internal class SumAllTest{

    @Test
    fun testEmpty(){
        assertEquals(sumAll(arrayOf()), 0)
    }

    @Test
    fun testSimple(){
        assertEquals(sumAll(arrayOf(10)), 10)
    }

    @Test
    fun testComplex(){
        assertEquals(sumAll(arrayOf(4, 12, 9, -1)), 24)
    }

    @Test
    fun test100Zeroes(){
        assertEquals(sumAll(Array(100) {0}), 0)
    }

    @Test
    fun test100Ones(){
        assertEquals(sumAll(Array(100) {1}), 100)
    }
}