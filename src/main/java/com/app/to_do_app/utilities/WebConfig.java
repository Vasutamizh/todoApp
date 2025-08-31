//package com.app.to_do_app.utilities;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        // Forward all non-API requests to the React app's index.html
//        registry.addViewController("/{spring:[\\w-]+}")
//                .setViewName("forward:/index.html");
//        registry.addViewController("/**/{spring:[\\w-]+}")
//                .setViewName("forward:/index.html");
//        registry.addViewController("/{spring:[\\w-]+\\.html}")
//                .setViewName("forward:/index.html");
//    }
//}