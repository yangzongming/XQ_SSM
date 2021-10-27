package com.megagao.production.ssm;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@EnableEurekaClient
@Configuration
@ComponentScan
public class XQCoreApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/springmvc-servlet.xml");
        //得到类的实例
        //Entity01 ent01 = (Entity01) context.getBean(Entity01.class);
        //System.out.println(ent01);
        ClassPathXmlApplicationContext en=(ClassPathXmlApplicationContext)context;
        en.close();
    }
}
