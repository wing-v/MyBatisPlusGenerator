package com.xiaozhisha.vv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaozhisha.vv"})
@MapperScan(value = "com.xiaozhisha.vv.dao")
@RestController
public class VvApplication {

	public static void main(String[] args) {
		SpringApplication.run(VvApplication.class, args);
	}

}
