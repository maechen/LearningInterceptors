package com.geeksforgeeks.request_interceptor.RequestInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class RequestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle (@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull Object handler) throws Exception {
        try {
            System.out.println("1 - preHandle() : Before sending req to controller");
            System.out.println("Method type : " + request.getMethod());
            System.out.println("Request URL : " + request.getRequestURI());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public void postHandle (@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        try {
            System.out.println("2 - postHandle() : After the controller serves the req (before returning back resp to client)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void afterCompletion (@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull Object handler, @Nullable Exception ex) throws Exception {
        try {
            System.out.println("3 - afterCompletion() : After the req and resp are completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
