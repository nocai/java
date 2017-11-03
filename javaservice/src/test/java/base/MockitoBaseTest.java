package base;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:spring-*.xml"})
@TestExecutionListeners({TransactionalTestExecutionListener.class, MockitoDependencyInjectionTestExecutionListener.class})
public class MockitoBaseTest {
}
