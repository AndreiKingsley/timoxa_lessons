import kotlin.test.*

internal class IsPalindromeTest {
    @Test
    fun testSingleLetter(){
        assertTrue(isPalindrome("A"))
    }

    @Test
    fun testSimple(){
        assertTrue(isPalindrome("aBBa"))
        assertTrue(isPalindrome("aBa"))
        assertFalse(isPalindrome("BaBa"))
        assertFalse(isPalindrome("Aaa"))
    }

    @Test
    fun testComplex(){
        assertTrue(isPalindrome("SATOR AREPO TENET OPERA ROTAS"))
    }
}