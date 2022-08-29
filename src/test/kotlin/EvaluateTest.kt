import kotlin.test.Test
import kotlin.test.assertEquals

internal class EvaluateTest{
    @Test
    fun testSum(){
        assertEquals(evaluate(0, 1, '+'), 1)
        assertEquals(evaluate(2, 7, '+'), 9)
        assertEquals(evaluate(10, 11, '+'), 21)
    }

    @Test
    fun testMinus(){
        assertEquals(evaluate(0, 1, '-'), -1)
        assertEquals(evaluate(2, 7, '-'), 5)
        assertEquals(evaluate(10, 11, '-'), -1)
    }

    @Test
    fun testMultiply(){
        assertEquals(evaluate(0, 1, '*'), 0)
        assertEquals(evaluate(2, 7, '*'), 14)
        assertEquals(evaluate(10, 11, '*'), 110)
    }

}