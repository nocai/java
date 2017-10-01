package com.liujun.hystrix;

import com.liujun.entity.Teacher;
import com.liujun.service.ITeacherService;
import com.netflix.hystrix.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Scope("prototype")
public class TeacherCommand extends HystrixCommand<Teacher> {
    @Resource
    private ITeacherService teacherService;

    private static final int coreSize = 32;
    private static final int maxQueueSize = 10;
    private static final int queueSizeRejectionThreshold = 10;
    private static final int timeout = 2000;

    public TeacherCommand() {
        super(HystrixCommand.Setter
                .withGroupKey(HystrixCommandGroupKey.Factory.asKey("TeacherCommandGroup"))
                .andCommandKey(HystrixCommandKey.Factory.asKey("TeacherCommandCommand"))
                .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("TeacherCommandPool"))
                .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.Setter().withCoreSize(coreSize).withMaxQueueSize(maxQueueSize).withQueueSizeRejectionThreshold(queueSizeRejectionThreshold))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter().withExecutionIsolationThreadTimeoutInMilliseconds(timeout)));
    }

    @Override
    protected Teacher run() throws Exception {
        return this.teacherService.getTeacher(1);
    }

    @Override
    protected Teacher getFallback() {
        System.out.println("getFallback");
        return null;
    }
}
