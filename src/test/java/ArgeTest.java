import codewars.seven.Arge;
import org.junit.Assert;
import org.junit.Test;

public class ArgeTest {
    @Test
    public void test() {
        Assert.assertEquals(Arge.nbYear(1500, 5, 100, 5000), 15);
        Assert.assertEquals(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
        Assert.assertEquals(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}
