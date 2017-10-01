//package com.liujun.controller;
//
//import com.liujun.entity.Teacher;
//import com.liujun.service.ITeacherService;
//import com.liujun.util.BeanValidatorUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.ConstraintViolationException;
//import javax.validation.Valid;
//import java.util.Map;
//
//@RestController
//@RequestMapping(value = {"/teacher"})
//public class TeacherController {
//    @Autowired
//    private ITeacherService teacherService;
//
//    @GetMapping
//    public Teacher teachers(int id) {
//        try {
//            return this.teacherService.getTeacher(id);
//        } catch (ConstraintViolationException e) {
//            Map<String, String> stringStringMap = BeanValidatorUtils.extractPropertyAndMessage(e);
//            System.out.println(stringStringMap);
//        }
//        return null;
//    }
//
//    @GetMapping(value = "add")
//    public void teacher(@Valid Teacher teacher,BindingResult result) {
//        System.out.println(teacher);
//        System.out.println(result);
//        invokeA(teacher);
//    }
//
//    public void invokeA(Teacher teacher) {
//        System.out.println(teacher);
//        invokeB(teacher);
//    }
//
//    public void invokeB(Teacher teacher) {
//        System.out.println(teacher);
//    }
//
//    @RequestMapping("t")
//    public void t() {
//        System.out.println("t");
//    }
//}
