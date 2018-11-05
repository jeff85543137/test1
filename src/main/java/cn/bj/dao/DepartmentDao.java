package cn.bj.dao;

import java.util.List;

import cn.bj.pojo.Department;
import cn.bj.pojo.Role;
import cn.bj.pojo.vo.Role_department;

public interface DepartmentDao {

	List<Department> getAll(Role_department rd);

}
