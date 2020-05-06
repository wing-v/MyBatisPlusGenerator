package com.xiaozhisha.vv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lx
 * @date 2019/4/15 23:49
 * @param 
 * @return 
 */
@SpringBootApplication
@RestController
public class VvApplication {

	public static void main(String[] args) {
		SpringApplication.run(VvApplication.class, args);
	}

}
