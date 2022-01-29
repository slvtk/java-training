import org.junit.jupiter.api.Test
import java.util.Arrays
import codewars.four.TopWords
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals

class TopWordTest {
  @Test
  fun sampleTests() {
    assertEquals(Arrays.asList("e", "d", "a"), TopWords.top3("a a a  b  c c  d d d d  e e e e e"))
    assertEquals(
      listOf("e", "ddd", "aa"),
      TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e")
    )
    assertEquals(listOf("won't", "wont"), TopWords.top3("  //wont won't won't "))
    assertEquals(listOf("e"), TopWords.top3("  , e   .. "))
    assertEquals(emptyList<Any>(), TopWords.top3("  ...  "))
    assertEquals(emptyList<Any>(), TopWords.top3("  '  "))
    assertEquals(emptyList<Any>(), TopWords.top3("  '''  "))
    assertEquals(
      listOf("a", "of", "on"), TopWords.top3(
        """
           "In a village of La Mancha, the name of which I have no desire to call to",
           "mind, there lived not long since one of those gentlemen that keep a lance",
           "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
           "coursing. An olla of rather more beef than mutton, a salad on most",
           "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
           "on Sundays, made away with three-quarters of his income."
           """
        )
      )
  }
}
