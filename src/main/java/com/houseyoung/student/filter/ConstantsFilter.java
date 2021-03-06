package com.houseyoung.student.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 获取${website}地址
 */
public class ConstantsFilter implements Filter{
    private String basePath;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String path = httpRequest.getContextPath();

        basePath = httpRequest.getScheme() + "://" + httpRequest.getServerName() + ":"
                + httpRequest.getServerPort()  + path + "/";

        request.setAttribute("website", basePath);
        chain.doFilter(request, response);
    }

    public String getWebsite() {
        return basePath;
    }
}