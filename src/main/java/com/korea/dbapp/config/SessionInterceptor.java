package com.korea.dbapp.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class SessionInterceptor implements HandlerInterceptor {

    //
    // boolean true 면 함수 진입, false면 진입 못함.
    // 공통 관심사를 넣는다.
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        HttpSession session = request.getSession();
        if (session.getAttribute("principal") == null) {
            // request.getRequestDispatcher("auth/loginForm");
            response.sendRedirect("auth/loginForm");
            return false;
        }
        return true;
    }
}
