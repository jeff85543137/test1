package cn.bj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bj.pojo.Member;
import cn.bj.pojo.Role;
import cn.bj.pojo.User;
import cn.bj.service.UserService;


@Controller
@RequestMapping("user")
public class LoginController extends JsonController {

	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping("login")
	public String login(HttpServletRequest request, User user){
			try {
				User user1 = userService.login(user);
				Member member = userService.findMemberById(user1.getId());
				request.getSession().setAttribute("member", member);
				request.getSession().setAttribute("userA", user1);
				return "index";
			} catch (Exception e) {
				String msg= e.getMessage();
				request.setAttribute("msg", msg);
				return "login";	
			}
	}
	@RequestMapping("tologin")
	public String toLogin(){
		return "login";
	}
	
	@RequestMapping("getRole")
	public void getRole(HttpServletRequest request,HttpServletResponse response){
		Member sessionMember = (Member) request.getSession().getAttribute("member");
		Role role = null ; 
		try {
			
			role = userService.selectByLoginUserId(sessionMember.getMid());
		} catch (NullPointerException e) {
			// TODO: handle exception
			writeResponse(response, "400", "您没有访问权限");
		}
//		role.setId(1L);
//		if (role == null) {
//			writeResponse(response, "400", "查询失败");
//			return;
//		}
		JsonUtilObjecToJson(response, "200", "查询成功", role);
		
	}
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("loginOut")
	public String loginOut(HttpServletRequest request){
		request.getSession().setAttribute("member", null);
		request.getSession().setAttribute("userA", null);

		return "login";
	}
}
