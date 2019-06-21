package cn.edu.stbu.jw.subjectmatch.Config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class myMVCconfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
          registry.addViewController("/index.html").setViewName("index");
//        registry.addViewController("/main.html").setViewName("index");
//        registry.addViewController("/comitte.html").setViewName("comitte");
//        registry.addViewController("/connect.html").setViewName("connect");
//        registry.addViewController("/download.html").setViewName("download");
//        registry.addViewController("/login.html").setViewName("login");
//        registry.addViewController("/news.html").setViewName("news");
//        registry.addViewController("/terminal.html").setViewName("terminal");
//        registry.addViewController("/travels.html").setViewName("travels");
//        registry.addViewController("/register.html").setViewName("register");
//
//        registry.addViewController("/manager/login").setViewName("/manager/login");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/subject/");
    }
}
