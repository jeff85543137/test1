package cn.bj.pojo.vo;

import cn.bj.pojo.base.BaseQuery;

public class Role_department extends BaseQuery{

	private long rid;
	private int did;
	public long getRid() {
		return rid;
	}
	public void setRid(long rid) {
		this.rid = rid;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public Role_department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role_department(long rid, int did) {
		super();
		this.rid = rid;
		this.did = did;
	}
	@Override
	public String toString() {
		return "Role_department [rid=" + rid + ", did=" + did + "]";
	}
	
}
