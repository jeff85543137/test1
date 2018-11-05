package cn.bj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.bj.common.Pages;
import cn.bj.pojo.Member;
import cn.bj.pojo.vo.Role_department;

public interface MemberService {

	List<Member> findAllMember();
	
	Pages<Member> getList(Role_department rd);
	
	int findLastMemberId();
	
	int saveMember(Member member, long permissionsId);

	int findHaveClient(Long mid);

	boolean deleteByid(Long mid);

	boolean deleteMemberTrue(Integer id);

	int queryMemberById(Long mid);
}
