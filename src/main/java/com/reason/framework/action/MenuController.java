package com.reason.framework.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reason.framework.model.Menu;

@Controller
@EnableAutoConfiguration
public class MenuController {

	@ResponseBody
	@RequestMapping(value ="/menu/getAll", method = RequestMethod.GET)
	public List<Menu> getMenu(){
		List<Menu> menus = new ArrayList<Menu>();
		menus.add(new Menu("001","Dashboard"));
		menus.add(new Menu("002","UserManage"));
		menus.add(new Menu("002","MenuManage"));
		return menus;
	}
}
