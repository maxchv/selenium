import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.model.Statement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class Test extends JUnitTestReporter {
    private final int first;
    private final int second;
    private final int result;
    private final String err;
    @Rule
    public Simplerule rule = new Simplerule();

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Parameterized.Parameters
    public static List<Object[]> isRightData() {
        return Arrays.asList(new Object[][]{
                {1, 2, 1, "Error"},
                {2, 1, 1, "Error"},
        });
    }

    public Test(int first, int second, int result, String err) {
        this.first = first;
        this.second = second;
        this.result = result;
        this.err = err;
    }


    @org.junit.Test
    public void testAdd() {
        Assert.assertEquals(err,first, second);
    }
}


class Simplerule implements TestRule {

    public Statement apply(final Statement base, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("Before");
                System.out.println(description.getDisplayName());
                base.evaluate();
                System.out.println("After");
            }
        };
    }
}

