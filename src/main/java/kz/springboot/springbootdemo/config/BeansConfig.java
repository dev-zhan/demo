package kz.springboot.springbootdemo.config;

import kz.springboot.springbootdemo.beans.ThirdBeanImpl;
import kz.springboot.springbootdemo.beans.Thirdbean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import kz.springboot.springbootdemo.beans.FirstBean;

@Configuration
public class BeansConfig {
    @Bean
    public FirstBean firstBean(){
        return new FirstBean();
    }
    @Bean
    public FirstBean secondBean(){
        return new FirstBean("Imangali",19);
    }
    @Bean
    public Thirdbean thirdbean(){
        return new ThirdBeanImpl();
    }
}
