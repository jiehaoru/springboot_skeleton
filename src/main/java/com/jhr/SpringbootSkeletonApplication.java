package com.jhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.jhr.dao")
@EnableTransactionManagement//service的实现类开启事务
@SpringBootApplication
public class SpringbootSkeletonApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootSkeletonApplication.class, args);

    }

}
