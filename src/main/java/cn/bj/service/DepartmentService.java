package cn.bj.service;

import java.util.List;

import cn.bj.common.Pages;
import cn.bj.pojo.Department;
import cn.bj.pojo.Member;
import cn.bj.pojo.Role;
import cn.bj.pojo.vo.Role_department;

public interface DepartmentService {

	List<Department> getAll(Role_department rd);

}
