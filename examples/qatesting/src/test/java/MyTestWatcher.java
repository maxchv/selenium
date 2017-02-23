import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class MyTestWatcher extends TestWatcher {
    @Override
    protected void succeeded(Description description) {
        System.out.println("Test succeeded end for: " + description.getMethodName());
        HtmlLogger.getInstance().testSuccess(description.getMethodName(), "OK");
    }

    @Override
    protected void failed(Throwable e, Description description) {
        System.out.println("Test failed with: " + e.getMessage());
        HtmlLogger.getInstance().testFail(description.getMethodName(), e.getMessage());
    }

    @Override
    protected void starting(Description description) {
        System.out.println("Test starting: " + description.getMethodName());
    }

    @Override
    protected void finished(Description description) {
        System.out.println("Test finished: " + description.getMethodName());
    }
}
