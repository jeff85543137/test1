package cn.bj.pojo;

import java.util.Date;

public class Clients {
    private Integer cid;

    private String cname;

    private Integer csex;

    private Long cphone;

    private Long ccard;

    private Long cqq;

    private String cweixin;

    private String caddress;

    private Date ccreatetime;

    private Integer stauts;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getCsex() {
        return csex;
    }

    public void setCsex(Integer csex) {
        this.csex = csex;
    }

    public Long getCphone() {
        return cphone;
    }

    public void setCphone(Long cphone) {
        this.cphone = cphone;
    }

    public Long getCcard() {
        return ccard;
    }

    public void setCcard(Long ccard) {
        this.ccard = ccard;
    }

    public Long getCqq() {
        return cqq;
    }

    public void setCqq(Long cqq) {
        this.cqq = cqq;
    }

    public String getCweixin() {
        return cweixin;
    }

    public void setCweixin(String cweixin) {
        this.cweixin = cweixin == null ? null : cweixin.trim();
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public Date getCcreatetime() {
        return ccreatetime;
    }

    public void setCcreatetime(Date ccreatetime) {
        this.ccreatetime = ccreatetime;
    }

    public Integer getStauts() {
        return stauts;
    }

    public void setStauts(Integer stauts) {
        this.stauts = stauts;
    }
}