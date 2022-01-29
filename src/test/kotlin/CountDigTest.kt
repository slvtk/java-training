import codewars.nbDig
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountDigTest {
  @Test
  fun test() {
    assertEquals(nbDig(5750, 0), 4700)
    assertEquals(nbDig(11011, 2), 9481)
  }
}
