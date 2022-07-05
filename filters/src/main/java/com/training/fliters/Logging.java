package com.training.fliters;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.*;
/**
 * Servlet Filter implementation class Logging
 */
@WebFilter(urlPatterns = "/*",dispatcherTypes = DispatcherType.FORWARD)
public class Logging implements Filter {
	Logger log=Logger.getLogger(this.getClass().getName());
    /**
     * Default constructor. 
     */
    public Logging() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpServletRequest req=(HttpServletRequest)request;
		String reqURI=req.getRequestURL().toString();
		log.info("URL"+reqURI);
		chain.doFilter(request, response);
		HttpServletResponse resp=(HttpServletResponse)response;
		String contentType=resp.getContentType();
		log.info(contentType);
		resp.getWriter().print("<h2>Transformes By Filter</h2>");
		resp.setHeader("custom","Set by filter");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
