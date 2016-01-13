package com.reason.framework.action;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author Reason
 *
 */
@Controller
@EnableAutoConfiguration
public class AccountController {

	@ResponseBody
	@RequestMapping(value ="/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }
}
