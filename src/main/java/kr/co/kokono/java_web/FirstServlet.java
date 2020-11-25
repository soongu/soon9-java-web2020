package kr.co.kokono.java_web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FirstServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init 메서드 호출!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet 메서드 호출!");
    }

    @Override
    public void destroy() {
        System.out.println("destroy 메서드 호출!");
    }
}