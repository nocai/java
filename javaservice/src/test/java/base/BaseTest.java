package base;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:spring-*.xml"})
public abstract class BaseTest {
//    @Autowired
//    protected ServletContext servletContext;
}
