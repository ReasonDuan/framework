package com.reason.framework.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * ’Àªßøÿ÷∆¿‡°£
 * @author Reason
 *
 */
@Controller
@EnableAutoConfiguration
public class AccountController {

	@RequestMapping(value ="/hello", method = RequestMethod.GET)
	@ResponseBody
    public String hello(){
        return "hello world";
    }
	
	
	public static void main(String[] args) {
        SpringApplication.run(AccountController.class, args);
    }
}
