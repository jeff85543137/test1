package cn.bj.pojo.vo;

/**
 * <p>
 * Title:返回页面提示信息：是否确认删除
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Administrator
 * @date 2018年3月29日 下午12:42:27
 */
public class BatchDeleteVo {
	private Long id;
	private String name;
	private String error;

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
		this.name = name;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
