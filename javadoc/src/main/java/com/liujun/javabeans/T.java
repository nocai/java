package com.liujun.javabeans;

import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;


public class T {
    @Test
    public void test() {
        BeanWrapper company = new BeanWrapperImpl(new Company());
// setting the company name..
        company.setPropertyValue("name", "Some Company Inc.");
// ... can also be done like this:
        PropertyValue value = new PropertyValue("name", "Some Company Inc.");
        company.setPropertyValue(value);
        System.out.println(company.getWrappedInstance());

// ok, let's create the director and tie it to the company:
        BeanWrapper jim = new BeanWrapperImpl(new Employee());
        jim.setPropertyValue("name", "Jim Stravinsky");
        company.setPropertyValue("managingDirector", jim.getWrappedInstance());

        System.out.println(jim.getWrappedInstance());
        System.out.println(company.getWrappedInstance());

// retrieving the salary of the managingDirector through the company
        Float salary = (Float) company.getPropertyValue("managingDirector.salary");
    }
}
