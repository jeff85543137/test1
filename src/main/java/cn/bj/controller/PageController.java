package cn.bj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pages")
public class PageController extends JsonController{

	@RequestMapping("main")
	public String main(){
		return "main";
	}
	
	@RequestMapping("employee-add")
	public String employeeadd(){
		return "employee-add";
	}
}
