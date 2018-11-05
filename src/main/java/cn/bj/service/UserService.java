package cn.bj.service;

import cn.bj.pojo.Member;
import cn.bj.pojo.Role;
import cn.bj.pojo.User;

public interface UserService {

	User login(User user);

	Role selectByLoginUserId(int id);

	Member findMemberById(int id);

}
