package com.reason.framework.main;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.reason")
public class RAppStart {

	public static void main(String[] args) {
        /*
        SpringApplication.run(new Object[]{
        		AccountController.class,
        		AuthFilter.class
        }, args);
        */
		SpringApplication.run(RAppStart.class, args);
    }
}
