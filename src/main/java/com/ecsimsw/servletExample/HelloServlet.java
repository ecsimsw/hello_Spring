package com.ecsimsw.servletExample;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("doPost");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}

/*
 서블릿 동작 원리

서블릿 컨테이너
 1. 웹 서버로부터 요청을 받아 HttpServletRequest 객체와 HttpServletResponse 객체를 생성한다.
 2. 요청 URL이 어떤 서블릿이 필요한 요청인지 설정 파일을 참고하여 찾는다. (web.xml)
 3. 해당 서블릿 인스턴스가 존재하는지 확인하고 없다면 init()를 생성하여 로딩한다.
 4. 스레드를 생성하고 서블릿 인스턴스의 서비스 로직이 실행된다. (doGet, doPost)
 5. 응답이 완료되면 HttpServletRequest 객체와 HttpServletResponse 객체를 소멸시킨다.
  */
