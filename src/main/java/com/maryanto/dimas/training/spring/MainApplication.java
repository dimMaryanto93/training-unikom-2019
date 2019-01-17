package com.maryanto.dimas.training.spring;

import com.maryanto.dimas.training.spring.beans.BeanA;
import com.maryanto.dimas.training.spring.beans.BeanB;
import com.maryanto.dimas.training.spring.beans.BeanC;
import com.maryanto.dimas.training.spring.beans.BeanD;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class MainApplication {

    @Bean
    public BeanD beanD() {
        return new BeanD(20);
    }

    @Bean
    public BeanC beanC() {
        return new BeanC(10);
    }

    @Bean
    public BeanB beansB(
            BeanC c,
            BeanD d) {
        return new BeanB(c, d);
    }

    @Bean
    public BeanA beanA(BeanB b) {
        return new BeanA(b);
    }

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(MainApplication.class);
        BeanA a = container.getBean(BeanA.class);
        log.info("{}", a);

    }
}
