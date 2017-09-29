package com.epam.spring;

import com.epam.guice.component.TestComponent;
import com.epam.guice.component.TestComponent2;
import com.epam.guice.component.TestComponent3;
import com.epam.guice.component.TestComponent4;
import com.epam.guice.module.BasicModule;
import com.epam.spring.aspect.TestAspect;
import com.epam.spring.component.SpringComponent;
import com.epam.spring.component.SpringComponent2;
import com.epam.spring.component.SpringComponent3;
import com.epam.spring.component.SpringComponent4;
import com.epam.spring.config.SpringAppConfig;
import com.epam.spring.security.AutheticationManagerImpl;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;

public class SpringTaskApp {
    public static void main(String[] args){
        Date date = new Date();
        long start = date.getTime();
        System.out.println(date.getTime());

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringAppConfig.class);
        SecurityContextHolder.getContext()
                .setAuthentication(applicationContext.getBean(AutheticationManagerImpl.class)
                        .authenticate(new UsernamePasswordAuthenticationToken("name", "name")));
        //TestAspect testAspect = applicationContext.getBean(TestAspect.class);
        date = new Date();
        System.out.println(start - date.getTime());
        SpringComponent springComponent = applicationContext.getBean(SpringComponent.class);
        SpringComponent2 springComponent2 = applicationContext.getBean(SpringComponent2.class);
        date = new Date();
        System.out.println(start - date.getTime());
        SpringComponent3 springComponent3 = applicationContext.getBean(SpringComponent3.class);
        SpringComponent4 springComponent4 = applicationContext.getBean(SpringComponent4.class);
        date = new Date();
        System.out.println(start - date.getTime());
        /*springComponent = applicationContext.getBean(SpringComponent.class);
        springComponent = applicationContext.getBean(SpringComponent.class);
        springComponent = applicationContext.getBean(SpringComponent.class);
        springComponent = applicationContext.getBean(SpringComponent.class);
        springComponent = applicationContext.getBean(SpringComponent.class);*/

        springComponent.sendMessage("haha", true);
        springComponent.testing("gg");
        springComponent.sendMessage("haha", true);
        springComponent.testing("gg");

        springComponent2.sendMessage("haha", true);
        springComponent2.testing("gg");

        springComponent3.sendMessage("haha", true);
        springComponent3.testing("gg");

        springComponent4.sendMessage("haha", true);
        springComponent4.testing("gg");

        //dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        date = new Date();
        System.out.println(start - date.getTime());
    }
}
