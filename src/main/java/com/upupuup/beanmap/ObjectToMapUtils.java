package com.upupuup.beanmap;

import org.springframework.cglib.beans.BeanMap;

import java.util.Map;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/7/17 12:47
 * @Version: 1.0
 * @Description: 对象转map
 */
public class ObjectToMapUtils {
	public static Map<String, Object> currentUserToMap() {
		User user = new User();
		user.setUsername("小明");
		user.setPaswword("aaa");
		user.setGender(1);
		if (null != user) {
			// 创建beanMap对象
			return BeanMap.create(user);
		}
		return null;
	}

	public static void main(String[] args) {
		Map<String, Object> stringObjectMap = currentUserToMap();
		System.out.println(stringObjectMap);
	}
}
