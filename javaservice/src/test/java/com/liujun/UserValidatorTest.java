package com.liujun;

import base.BaseTest;
import com.liujun.entity.User;
import com.liujun.validator.UserValidator;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;

public class UserValidatorTest extends BaseTest {
    @Autowired
    private UserValidator userValidator;

    @Test
    public void testEmptyObject() {
        User user = new User();
        BindException errors = new BindException(user, "target");
        userValidator.validate(user, errors);
        Assert.assertTrue(errors.getAllErrors().size() == 2);
        ObjectError error1 = (ObjectError) (errors.getAllErrors().get(0));
        Assert.assertEquals(error1.getDefaultMessage(), "Name is empty or too long.");
        ObjectError error2 = (ObjectError) (errors.getAllErrors().get(1));
        Assert.assertEquals(error2.getDefaultMessage(), "Address is empty.");
    }
}