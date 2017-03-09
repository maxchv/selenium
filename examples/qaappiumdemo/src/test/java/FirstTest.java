import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 08.03.2017.
 */
public class FirstTest {
    @Test
    public void start() throws Exception {
        Assert.assertTrue(true);
    }

    @Test
    public void fails() throws Exception {
        Assert.assertTrue("Должно быть true", false);
    }

    @Before
    public void setUp() throws Exception {

    }
}
