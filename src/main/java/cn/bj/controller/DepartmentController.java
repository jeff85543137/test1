package cn.bj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bj.common.Pages;
import cn.bj.pojo.Department;
import cn.bj.pojo.Member;
import cn.bj.pojo.Role;
import cn.bj.pojo.vo.Role_department;
import cn.bj.service.DepartmentService;
import cn.bj.service.UserService;

@Controller
@RequestMapping("department")
public class DepartmentController extends JsonController{

	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("getAll")
	public void getAll(HttpServletRequest request,HttpServletResponse response){
		Member member =(Member) request.getSession().getAttribute("member");
		Role role = userService.selectByLoginUserId(member.getMid());
		Role_department rd =new Role_department(role.getId(), member.getDepartmentid());
		List<Department> pages =departmentService.getAll(rd);
		JsonUtilObjecToJson(response, "200", "success", pages);
	}
}
