import org.junit.jupiter.api.Test
import codewars.seven.Arge
import org.junit.jupiter.api.Assertions.assertEquals

class ArgeTest {
  @Test
  fun test() {
    assertEquals(Arge.nbYear(1500, 5.0, 100, 5000), 15)
    assertEquals(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10)
    assertEquals(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94)
  }
}
