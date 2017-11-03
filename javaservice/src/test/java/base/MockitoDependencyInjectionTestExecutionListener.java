package base;

import org.mockito.MockitoAnnotations;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

public class MockitoDependencyInjectionTestExecutionListener extends DependencyInjectionTestExecutionListener {

    @Override
    protected void injectDependencies(TestContext testContext) throws Exception {
        super.injectDependencies(testContext);
        MockitoAnnotations.initMocks(testContext.getTestInstance());
    }
}


