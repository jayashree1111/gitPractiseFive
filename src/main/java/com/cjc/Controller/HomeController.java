package com.cjc.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.ServiceI.ServiceI;


@Controller
public class HomeController {
	
	@Autowired
	ServiceI si;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	

	
	
	
	
	
	
	

}
