package com.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(value = "/c65",filterName = "filter1")
public class MyFirstFilter implements Filter {
    @Override//Filterchain - цепочка фильтров или сервлетов, т.е. кого след вызовут
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 1 work!");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
