package com.xiaozhisha.vv;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaozhisha.vv"})
@MapperScan(value = "com.xiaozhisha.vv.Dao")
@RestController
public class VvApplication {

	public static void main(String[] args) {
		SpringApplication.run(VvApplication.class, args);
	}

}
