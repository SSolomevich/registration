package ru.registration.controller;

/**
 * Created by 15 on 01.04.2017.
 */


import ru.registration.model.User;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class CheckUser extends Dispatcher {
    public String getServletInfo(){
        return "Registration servlet";
    }

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = UserList.findUser(request.getParameter("user"));
        if (user == null){
            this.forward("/registration.html", request, response);
        } else {
            if
                    (!user.getPassword().equals(request.getParameter("password"))){
                this.forward("/registration.html", request, response);
            } else {
                this.forward("/successLogin.jsp", request, response);
            }
        }
    }

}
