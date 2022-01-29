import org.junit.jupiter.api.Test
import codewars.five.PaginationHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import java.util.Arrays

class PaginationHelpTest {
  @Test
  fun test() {
    val helper = PaginationHelper(listOf('a', 'b', 'c', 'd', 'e', 'f'), 4)
    assertEquals(2, helper.pageCount())
    assertEquals(6, helper.itemCount())
    assertEquals(4, helper.pageItemCount(0))
    assertEquals(2, helper.pageItemCount(1))
    assertEquals(-1, helper.pageItemCount(2))
    assertEquals(1, helper.pageIndex(5))
    assertEquals(0, helper.pageIndex(2))
    assertEquals(-1, helper.pageIndex(20))
    assertEquals(-1, helper.pageIndex(-10))
    assertEquals(0, helper.pageIndex(0))
  }
}
