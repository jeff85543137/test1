package cn.bj.pojo;

public class Role {
    private Long id;

    private String name;

    private String redescribe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRedescribe() {
        return redescribe;
    }

    public void setRedescribe(String redescribe) {
        this.redescribe = redescribe == null ? null : redescribe.trim();
    }
}