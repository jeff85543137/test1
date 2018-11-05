package cn.bj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.bj.common.Pages;
import cn.bj.dao.MemberDao;
import cn.bj.pojo.LoginUserMember;
import cn.bj.pojo.Member;
import cn.bj.pojo.RoleMember;
import cn.bj.pojo.User;
import cn.bj.pojo.vo.Role_department;
import cn.bj.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;

	@Override
	public List<Member> findAllMember() {
		return memberDao.findAllMember();
	}

	@Override
	public Pages<Member> getList(Role_department rd) {
		
		PageHelper.startPage(rd.getPageIndex(), rd.getPageSize());
		List<Member> list = memberDao.getList(rd);
		// Page<Member> page = (Page<Member>) list;
		if(list.size()>0){
		PageInfo<Member> page = new PageInfo<Member>(list);

		Pages<Member> pages = new Pages<Member>(page.getStartRow(),
				page.getTotal(), page.getPageSize(), list);
			return pages;
		}
		
		List<Member> listNull = new ArrayList<Member>();
		listNull.add(new Member());
		PageInfo<Member> page = new PageInfo<Member>(listNull);
		Pages<Member> pages = new Pages<Member>(page.getStartRow(),
				page.getTotal(), page.getPageSize(), listNull);
		return pages;
	}

	@Override
	public int findLastMemberId() {
		return memberDao.findLastMemberId();
	}

	@Override
	@Transactional
	public int saveMember(Member member, long permissionsId) {
		
		int i =memberDao.saveMember(member);
		if(i ==0){
			throw new RuntimeException("保存用户出错");
		}
		RoleMember rm = new RoleMember(member.getMid(),permissionsId);
		int j=memberDao.saveRole_member(rm);
		if(j ==0){
			throw new RuntimeException("保存用户权限出错");
		}
		int uid=memberDao.findLastUserId()+1;
		User user = new User(uid,member.getMname(),member.getMid()+"");
		int k=memberDao.saveLogin_user(user);
		if(k ==0){
			throw new RuntimeException("保存登录用户信息出错");
		}
		LoginUserMember lum = new LoginUserMember(uid,member.getMid());
		int z=memberDao.saveLogin_user_Member(lum);
		if(z ==0){
			throw new RuntimeException("保存登录用户关系出错");
		}
		
		return 0;
	}

	@Override
	public int findHaveClient(Long mid) {
		return memberDao.findHaveClient(mid);
	}

	@Override
	@Transactional
	public boolean deleteByid(Long mid) {
		int mid1 = memberDao.queryMemberById(mid);
		int i =memberDao.deleteLogin_user(mid1);
		if(i ==0){
			throw new RuntimeException("刪除登录用户信息出错");
		}
		int j=memberDao.deleteLogin_user_Member(mid);
		if(j ==0){
			throw new RuntimeException("刪除登录用户关系出错");
		}
		int k=memberDao.deleteMember(mid);
		if(k ==0){
			throw new RuntimeException("刪除用户出错");
		}
		int z=memberDao.deleteRole_Member(mid);
		if(z ==0){
			throw new RuntimeException("刪除用户权限出错");
		}
		
		return true;
	}

	@Override
	@Transactional
	public boolean deleteMemberTrue(Integer id) {
		long id1 = id.longValue();
		boolean flag = deleteByid(id1);
		int i =memberDao.deleteMember_clients(id1);
		if(i ==0){
			throw new RuntimeException("刪除登录用户信息出错");
		}
		return true;
	}

	@Override
	public int queryMemberById(Long mid) {
		return memberDao.queryMemberById(mid);
	}

}
