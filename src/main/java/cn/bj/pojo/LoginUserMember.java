package cn.bj.pojo;

public class LoginUserMember {
    private Integer loginuserid;

    private Integer memberid;

    public Integer getLoginuserid() {
        return loginuserid;
    }

    public void setLoginuserid(Integer loginuserid) {
        this.loginuserid = loginuserid;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

	public LoginUserMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginUserMember(Integer loginuserid, Integer memberid) {
		super();
		this.loginuserid = loginuserid;
		this.memberid = memberid;
	}
    
    
}