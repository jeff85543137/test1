package cn.bj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bj.pojo.Member;
import cn.bj.pojo.Role;
import cn.bj.service.RoleService;
import cn.bj.service.UserService;

@Controller
@RequestMapping("role")
public class RoleController extends JsonController{

	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("getAll")
	public void getAll(HttpServletRequest request,HttpServletResponse response){
		Member member =(Member) request.getSession().getAttribute("member");
		Role role = userService.selectByLoginUserId(member.getMid());
		List<Role> list =roleService.getAll(role);
		JsonUtilObjecToJson(response, "200", "查询成功", list);

	}
}
