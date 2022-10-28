package com.training.pms.galaxe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {


	@GetMapping("index")			//   http://localhost:9094/home
	public String home() {
		return "Rajesh";				///WEB-INF/views/ashraf.jsp
	}	

	@GetMapping	//   http://localhost:9094
	public String hello() {
		return "index";				///WEB-INF/views/index.jsp
	}	
	
	@GetMapping("viewAllProducts")			//   http://localhost:9094/home
	public String jasdasd() {
		return "viewAllProducts";				///WEB-INF/views/ashraf.jsp
	}	
	
	@GetMapping("addProduct")			//   http://localhost:9094/home
	public String levin() {
		return "addProducts";				///WEB-INF/views/ashraf.jsp
	}	
}
