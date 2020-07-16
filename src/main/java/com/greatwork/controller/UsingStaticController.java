package com.greatwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Controller
public class UsingStaticController {

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
// classpath表示在resource目录下，/static/** 表示在URL路径中访问如
// http://localhost:8080/static/ 即可访问到resource下的static目录
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }


}
