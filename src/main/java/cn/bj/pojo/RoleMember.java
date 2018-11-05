package cn.bj.pojo;

public class RoleMember {
    private Integer memberid;

    private Long roleid;

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

	@Override
	public String toString() {
		return "RoleMember [memberid=" + memberid + ", roleid=" + roleid + "]";
	}

	public RoleMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleMember(Integer memberid, Long roleid) {
		super();
		this.memberid = memberid;
		this.roleid = roleid;
	}
    
    
}