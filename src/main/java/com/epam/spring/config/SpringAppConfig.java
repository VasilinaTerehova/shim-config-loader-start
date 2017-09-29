package com.epam.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.epam.spring"}, lazyInit = true)
@EnableAspectJAutoProxy
public class SpringAppConfig {
}
