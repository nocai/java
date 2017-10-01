//package com.liujun.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletResponse;
//import java.util.List;
//
//@Controller
//@RequestMapping(value ="cookie" )
//public class CookieController {
//    @PostMapping()
//    public void setCookie(HttpServletResponse response) {
//        response.addCookie(new Cookie("cookie_name", "cookie_value"));
//    }
//
//    @GetMapping
//    public List<Cookie> cookies(@CookieValue(value = "cookie_name") String cookie_name) {
//        System.out.println(cookie_name);
//        return null;
//    }
//}
