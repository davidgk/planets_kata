package com.dgkkatas.planets.config;

/**
 * Created by davidgk on 17/06/16.
 */
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * In servlet 3.0, now java web application has capability to run its application without using web.xml.
 * In spring 3.1 onwards WebApplicationInitializer is used in place of web.xml and continue to Spring 4. In our demo all the web setting will be done in a class which will implement WebApplicationInitializer.
 On startup, server looks for WebApplicationInitializer.
 If server finds it in the application, then server starts the application using the settings defined
 in WebApplicationInitializer implementing class.
 */

public class WebAppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfig.class);
        ctx.setServletContext(servletContext);
        Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        dynamic.addMapping("/");
        dynamic.setLoadOnStartup(1);
    }
}
