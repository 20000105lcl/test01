package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @Title: SpringMvcConfig
 * @Author: 刘成龙
 * @Version:1.0
 * @time: 2022/12/04 14:49
 */
@Configuration
@ComponentScan({"org.example.controller","org.example.config"})
public class SpringMvcConfig {

}
