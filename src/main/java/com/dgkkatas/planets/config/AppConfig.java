package com.dgkkatas.planets.config;
/**
 * Created by davidgk on 17/06/16.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
* Spring configuration will not use XML approach. @Configuration
 * supports a class to define the spring configuration for component and beans used in the application.
*
* */
@Configuration
@ComponentScan("com.concretepage")
@EnableWebMvc
public class AppConfig {
}