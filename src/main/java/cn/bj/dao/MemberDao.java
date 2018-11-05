package cn.bj.dao;

import java.util.ArrayList;
import java.util.List;

import cn.bj.common.Pages;
import cn.bj.pojo.LoginUserMember;
import cn.bj.pojo.Member;
import cn.bj.pojo.RoleMember;
import cn.bj.pojo.User;
import cn.bj.pojo.vo.Role_department;

public interface MemberDao {

	List<Member> findAllMember();

	ArrayList<Member> getList(Role_department rd);

	int findLastMemberId();

	int findLastUserId();

	int saveMember(Member member);

	int saveRole_member(RoleMember rm);

	int saveLogin_user(User user);

	int saveLogin_user_Member(LoginUserMember lum);

	int findHaveClient(Long mid);

	int deleteLogin_user(int mid);

	int deleteLogin_user_Member(Long mid);

	int deleteMember(Long mid);

	int deleteRole_Member(Long mid);

	int deleteMember_clients(long id1);

	int queryMemberById(Long mid);


}
