package com.liujun.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class KaptchaServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service...");
//        super.service(req, res);
//
//
//        String kaptcha = (String) ((HttpServletRequest) req).getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
//        System.out.println("kaptcha = " + kaptcha);
//
//
//        PrintWriter writer = res.getWriter();
//        writer.print(kaptcha);
//        writer.flush();
    }
}
