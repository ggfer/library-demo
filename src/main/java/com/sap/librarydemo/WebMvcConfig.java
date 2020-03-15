package com.sap.librarydemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig implements WebMvcConfigurer {
    @Configuration
    public class WebMvcConfg implements WebMvcConfigurer {

        public void configurePathMatch(PathMatchConfigurer configurer) {
            configurer.setUseTrailingSlashMatch(false);
        }

        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/index").setViewName("index.html");
        }

    }
}
