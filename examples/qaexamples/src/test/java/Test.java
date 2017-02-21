import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Created by User on 16.02.2017.
 */
public class Test extends JUnitTestReporter {
    @Rule
    public Simplerule rule = new Simplerule();

    @org.junit.Test
    public void testAdd() {
        Assert.assertEquals(10, 10);
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

