package com.training.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.logging.*;
/**
 * Application Lifecycle Listener implementation class MyContactListener
 *
 */
@WebListener
public class MyContactListener implements ServletContextListener {

	Logger log=Logger.getLogger(this.getClass().getName());
    /**
     * Default constructor. 
     */
    public MyContactListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	log.info("Context Destoyed");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
        log.info("Context Initialized");
        ServletContext ctx=sce.getServletContext();
        log.info(ctx.getContextPath());
        log.info(ctx.getContextPath());
    }
	
}
