package cn.bj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.bj.common.Pages;
import cn.bj.dao.DepartmentDao;
import cn.bj.pojo.Department;
import cn.bj.pojo.Member;
import cn.bj.pojo.Role;
import cn.bj.pojo.vo.Role_department;
import cn.bj.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	@Override
	public List<Department> getAll(Role_department rd) {
		List<Department> list = departmentDao.getAll(rd);

		return list;
	}

}
