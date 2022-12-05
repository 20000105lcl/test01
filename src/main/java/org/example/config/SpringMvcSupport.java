package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @description:
 * @Title: SpringMvcSupport
 * @Author: 刘成龙
 * @Version:1.0
 * @time: 2022/12/04 16:48
 */
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/component/**").addResourceLocations("/component/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
    }
}
