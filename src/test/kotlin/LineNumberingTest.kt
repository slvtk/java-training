import org.junit.jupiter.api.Test
import java.util.Arrays
import codewars.seven.LineNumbering
import org.junit.jupiter.api.Assertions

class LineNumberingTest {
  @Test
  fun basicTests() {
    Assertions.assertEquals(emptyList<String>(), LineNumbering.number(emptyList()))
    Assertions.assertEquals(listOf("1: a", "2: b", "3: c"), LineNumbering.number(listOf("a", "b", "c")))
    Assertions.assertEquals(listOf("1: ", "2: ", "3: ", "4: ", "5: "), LineNumbering.number(listOf("", "", "", "", "")))
  }
}
