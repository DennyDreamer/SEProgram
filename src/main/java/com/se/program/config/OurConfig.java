package com.se.program.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class OurConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){

        registry.addViewController("/index").setViewName("login");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/user.html").setViewName("user");
        registry.addViewController("/checker.html").setViewName("checker");
        registry.addViewController("/receiver.html").setViewName(("receiver"));
        registry.addViewController("/checker_admin.html").setViewName("check_admin");
        registry.addViewController("/admin.html").setViewName("admin");

    }

   // @Override
    //public void addInterceptors(InterceptorRegistry registry) {
      //  registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
        //        .excludePathPatterns("/index.html","/","/user/login");
}
