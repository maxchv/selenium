import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class SimpleRule implements TestRule{
    public Statement apply(final Statement base, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("start method: " +
                        description.getMethodName());
                base.evaluate(); // выполнение метода с аннотацией @Test
                System.out.println("finish method: " +
                        description.getMethodName());
            }
        };
    }
}
