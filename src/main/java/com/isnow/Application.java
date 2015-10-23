package com.isnow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lxq on 15-10-23.
 */

/**
 * spring-boot的一些注解
 *      1.@Configuration 注解是spring去xml配置,是spring基于java的配置
 *          @Bean  一个带有 @Bean 的注解方法将返回一个对象
 *      2.@ComponentScan 收集自动收集所有的spring组件  搜索beans
 *
 *      3.@Import导入其他的Configuration类
 *      4.	@ImportResource附加注入一个外置的xml
 *      5. 	@EnableAutoConfiguration	 或 	@SpringBootApplication  自动配置
 *
 * Spring-boot加载配置文件的顺序是
 *      1. ./config/application.properties
        2. ./application.properties
        3. classpath:config/application.properties
        4. classpath:application.properties
 *
 * yaml文件里配置项名和bean里的属性名相同
 */

@Configuration    //表明这个类是java配置类
@EnableAutoConfiguration  //自动配置
@ComponentScan   //搜索bean
//@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }


}
