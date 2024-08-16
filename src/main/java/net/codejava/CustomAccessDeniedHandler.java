package net.codejava;



import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException exc) throws IOException, ServletException {
        Authentication auth = (Authentication) request.getUserPrincipal();
        String targetUrl = "/403";

        if (request.getRequestURI().startsWith("/admin")) {
            targetUrl = "/admin/login";
        } else if (request.getRequestURI().startsWith("/customer")) {
            targetUrl = "/customer/login";
        }

        response.sendRedirect(targetUrl);
    }
}
