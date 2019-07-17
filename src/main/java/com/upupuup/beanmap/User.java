package com.upupuup.beanmap;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/7/17 13:03
 * @Version: 1.0
 * @Description: 用户实体类
 */
public class User {
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String paswword;
	/**
	 * 性别
	 */
	private Integer gender;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPaswword() {
		return paswword;
	}

	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}
}
