package com.listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class StartApplicationListener implements ServletContextListener {//подъем и падение страницы

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Application listener started.... ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Application listener finished.... ");
    }
}
