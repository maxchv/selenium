import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Created by User on 16.02.2017.
 */
public class JUnitTestReporter {
    @Rule
    public TestRule jUnitWatcher = new TestWatcher() {

        @Override
        protected void finished(Description description) {
            System.out.println("Fin");
        }

        @Override
        protected void starting(Description description) {
            System.out.println("Start");
        }

        @Override
        protected void succeeded(Description description) {
            super.succeeded(description);
            System.out.println(description.getDisplayName() + " Test Pass");
        }

        @Override
        protected void failed(Throwable e, Description description) {
            super.failed(e, description);
            System.out.println(description.getDisplayName() + " "
                    + e.getClass().getSimpleName());
        }
    };
}
