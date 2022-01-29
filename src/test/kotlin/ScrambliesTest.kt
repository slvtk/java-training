import org.junit.jupiter.api.Test
import codewars.five.Scramblies
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue

class ScrambliesTest {
  @Test
  fun test() {
    assertTrue(Scramblies.scramble("rkqodlw", "world"))
    assertTrue(Scramblies.scramble("cedewaraaossoqqyt", "codewars"))
    assertFalse(Scramblies.scramble("katas", "steak"))
    assertFalse(Scramblies.scramble("scriptjavx", "javascript"))
    assertTrue(Scramblies.scramble("scriptingjava", "javascript"))
    assertTrue(Scramblies.scramble("scriptsjava", "javascripts"))
    assertFalse(Scramblies.scramble("javscripts", "javascript"))
    assertTrue(Scramblies.scramble("aabbcamaomsccdd", "commas"))
    assertTrue(Scramblies.scramble("commas", "commas"))
    assertTrue(Scramblies.scramble("sammoc", "commas"))
  }
}
