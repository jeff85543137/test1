package cn.bj.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import cn.bj.common.JsonUtils;
import cn.bj.common.Pages;
import cn.bj.pojo.Member;
import cn.bj.pojo.Role;
import cn.bj.pojo.vo.BatchDeleteVo;
import cn.bj.pojo.vo.Role_department;
import cn.bj.service.MemberService;
import cn.bj.service.UserService;

@Controller
@RequestMapping("member")
public class MemberController extends JsonController {
	
	@Autowired
	private MemberService MemberService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("findAllMember")
	public void findAllMember(){
		List<Member> list =MemberService.findAllMember();
		for (Member member : list) {
			System.out.println(member);
		}
	}
	
	@RequestMapping("index")
	public String getPageIndex(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		return "employee-data";
	}
	
	@RequestMapping("getList")
	public void getList(HttpServletRequest request,HttpServletResponse response){
		Member member =(Member) request.getSession().getAttribute("member");
		Role role = userService.selectByLoginUserId(member.getMid());
		Pages<Member> pages =MemberService.getList(new Role_department(role.getId(), member.getDepartmentid()));
		JsonUtilObjecToJson(response, "200", "success", pages);
	}
	
	@RequestMapping("save")
	public void save(HttpServletRequest request,HttpServletResponse response,Member member, long permissionsId){
		//System.out.println(member);
		//System.out.println(permissionsId);
		
		int lastId =MemberService.findLastMemberId();
		member.setMid(lastId+1);
		int i =MemberService.saveMember(member,permissionsId);
		JsonUtilObjecToJson(response, "200", "success","1");
	}
	
	@RequestMapping("batchDelete")
	public void batchDelete(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam("ids") String json ){
		
		Member member =(Member) request.getSession().getAttribute("member");
		Role role = userService.selectByLoginUserId(member.getMid());
		if (role.getId().compareTo(3L) == 0) {
			writeResponse(response, "400", "该用户无删除员工权限");
			return;
		}
		List<Long> ids = null;
		try {
			ids = (List<Long>) JsonUtils.jsonToList(json, Long.class);
		} catch (Exception e) {
			writeResponse(response, "400", "json格式不合法");
			return;
		}
		if (ids == null) {
			writeResponse(response, "400", "删除内容为空");
			return;
		}
		
		List<cn.bj.pojo.vo.BatchDeleteVo> listfalse = new ArrayList<>();
		BatchDeleteVo batchDeleteVo = null;
		for (Long mid : ids) {
			int i =MemberService.findHaveClient(mid);
			if(i>0){
				batchDeleteVo = new BatchDeleteVo();
				int mid1 = MemberService.queryMemberById(mid);
				Member member2 = userService.findMemberById(mid1);
				batchDeleteVo.setId(mid);
				batchDeleteVo.setName(member2.getMname());
				batchDeleteVo.setError("该员工名下还存在客户，请确认");
				listfalse.add(batchDeleteVo);
			}else{
				boolean delete = MemberService.deleteByid(mid);
				if (!delete) {
					batchDeleteVo = new BatchDeleteVo();
					int mid1 = mid.intValue();
					Member member3 = userService.findMemberById(mid1);
					batchDeleteVo.setId(mid);
					batchDeleteVo.setName(member.getMname());
					batchDeleteVo.setError("该员工删除失败，原因未知");
					listfalse.add(batchDeleteVo);
				}
			}
		}
		JsonUtilObjecToJson(response, "200", "删除【" + ids.size() + "】名员工，失败【"
				+ listfalse.size() + "】名", listfalse);
	}
	
	
	
	
	@RequestMapping("deleteMemberTrue/{id}")
	public void deleteMemberTrue(HttpServletResponse response,@PathVariable Integer id){
		boolean flag = MemberService.deleteMemberTrue(id);
		JsonUtilObjecToJson(response, "200", "删除【】名员工，失败【】名",11);
	}
}
