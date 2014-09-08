import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 08.09.14
 * Time: 15:20
 * To change this template use File | Settings | File Templates.
 */
public class MathTest {
    @Test
    public void testNotEquals()
    {
        Assert.assertFalse(5 == 25 / 3);
        System.out.print("Ksushkins");
    }

    @Test
    public void testEquals()
    {
        Assert.assertEquals(20, 5 * 5);


        Assert.assertTrue(20 == 4 * 6);
    }
}
