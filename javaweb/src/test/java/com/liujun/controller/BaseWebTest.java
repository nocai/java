package com.liujun.controller;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class) // 此处调用Spring单元测试类
@WebAppConfiguration // 调用javaWEB的组件，比如自动注入ServletContext Bean等等
@ContextConfiguration(locations = {"classpath:spring-servlet.xml"}) // 加载Spring配置文件
public abstract class BaseWebTest {
//    @Autowired
//    protected ServletContext servletContext;
    protected MockMvc mockMvc;
}
