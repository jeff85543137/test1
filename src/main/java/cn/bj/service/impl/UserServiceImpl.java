package cn.bj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bj.dao.UserDao;
import cn.bj.pojo.Member;
import cn.bj.pojo.Role;
import cn.bj.pojo.User;
import cn.bj.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
		
	@Override
	public User login(User user) {
		String passWord = user.getPassword().trim();
		if(passWord == null || passWord.equals("")) throw new RuntimeException("密码为空");
		String loginName = user.getLoginname().trim();
		if(loginName == null || loginName.equals("")) throw new RuntimeException("用户名为空");
		User user1 = userDao.login(user);
		if(user1 == null) throw new RuntimeException("用户或密码错误");
		
		return user1;
	}

	@Override
	public Role selectByLoginUserId(int id) {
		return userDao.selectByLoginUserId(id);
	}

	@Override
	public Member findMemberById(int id) {
		return userDao.findMemberById(id);
	}

}
