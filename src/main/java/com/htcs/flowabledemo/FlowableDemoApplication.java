package com.htcs.flowabledemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAsync(proxyTargetClass = true)
@EnableTransactionManagement
@MapperScan(value = {"com.htcs.flowabledemo.dao"})
/** 绕过登录 */
@SpringBootApplication(scanBasePackages = "com.htcs.flowabledemo.*",
        exclude = {
                org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
        }
)
public class FlowableDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlowableDemoApplication.class, args);
    }
}
