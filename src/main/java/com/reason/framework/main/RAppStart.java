package com.reason.framework.main;

import org.springframework.boot.SpringApplication;

import com.reason.framework.action.AccountController;
import com.reason.framework.action.MenuController;

public class RAppStart {

	public static void main(String[] args) {
        //SpringApplication.run(AccountController.class, args);
        SpringApplication.run(MenuController.class, args);
    }
}
