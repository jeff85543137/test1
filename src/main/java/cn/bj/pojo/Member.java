package cn.bj.pojo;

import java.util.Date;

import cn.bj.pojo.base.BaseQuery;

public class Member extends BaseQuery{
    private Integer mid;

    private String mname;

    private Integer msex;

    private Long mphone;

    private Long mcard;

    private Long mqq;

    private String mweixin;

    private String maddress;

    private Date mcreatetime;

    private Integer departmentid;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public Integer getMsex() {
        return msex;
    }

    public void setMsex(Integer msex) {
        this.msex = msex;
    }

    public Long getMphone() {
        return mphone;
    }

    public void setMphone(Long mphone) {
        this.mphone = mphone;
    }

    public Long getMcard() {
        return mcard;
    }

    public void setMcard(Long mcard) {
        this.mcard = mcard;
    }

    public Long getMqq() {
        return mqq;
    }

    public void setMqq(Long mqq) {
        this.mqq = mqq;
    }

    public String getMweixin() {
        return mweixin;
    }

    public void setMweixin(String mweixin) {
        this.mweixin = mweixin == null ? null : mweixin.trim();
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress == null ? null : maddress.trim();
    }

    public Date getMcreatetime() {
        return mcreatetime;
    }

    public void setMcreatetime(Date mcreatetime) {
        this.mcreatetime = mcreatetime;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", mname=" + mname + ", msex=" + msex + ", mphone=" + mphone + ", mcard=" + mcard
				+ ", mqq=" + mqq + ", mweixin=" + mweixin + ", maddress=" + maddress + ", mcreatetime=" + mcreatetime
				+ ", departmentid=" + departmentid + "]";
	}
    
    
}