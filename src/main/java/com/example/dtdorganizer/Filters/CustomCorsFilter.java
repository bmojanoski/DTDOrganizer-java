package com.example.dtdorganizer.Filters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CustomCorsFilter implements Filter {

    @Autowired
    Environment environment;

    public CustomCorsFilter() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;

        HttpServletRequest request = (HttpServletRequest) req;

        if (Arrays.stream(this.environment.getActiveProfiles()).anyMatch(env -> (env.equalsIgnoreCase("development")))) {
            response.setHeader("Access-Control-Allow-Origin", "*");
        } else if (Arrays.stream(this.environment.getActiveProfiles()).anyMatch(env -> (env.equalsIgnoreCase("production")))) {
            response.setHeader("Access-Control-Allow-Origin", "*");
        } else {
            response.setHeader("Access-Control-Allow-Origin", "*");
        }


        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PATCH, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, Authorization, X-Requested-With, Content-Type, Accept, Key");

        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            chain.doFilter(req, res);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }
}