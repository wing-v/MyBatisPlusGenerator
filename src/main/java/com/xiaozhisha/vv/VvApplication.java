package com.xiaozhisha.vv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lx
 * @date 2019/4/15 23:49
 * @param 
 * @return 
 */
@SpringBootApplication
@MapperScan(value = "com.xiaozhisha.vv.mapper")
@RestController
public class VvApplication {

	public static void main(String[] args) {
		SpringApplication.run(VvApplication.class, args);
	}

}
