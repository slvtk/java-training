import org.junit.jupiter.api.Test
import codewars.seven.Maskify
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
  @Test
  fun testSolution() {
    assertEquals("############5616", Maskify.maskify("4556364607935616"))
    assertEquals("#######5616", Maskify.maskify("64607935616"))
    assertEquals("1", Maskify.maskify("1"))
    assertEquals("", Maskify.maskify(""))
    assertEquals("##ippy", Maskify.maskify("Skippy"))
    assertEquals(
      "####################################man!",
      Maskify.maskify("Nananananananananananananananana Batman!")
    )
  }
}
