package cn.bj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bj.dao.RoleDao;
import cn.bj.pojo.Role;
import cn.bj.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	@Override
	public List<Role> getAll(Role role) {
		return roleDao.getAll(role);
	}

}
