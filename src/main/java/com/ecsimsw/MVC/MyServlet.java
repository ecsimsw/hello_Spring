package com.ecsimsw.MVC;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException{
        System.out.print("init");
    }
}
