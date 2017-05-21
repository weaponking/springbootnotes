package com.boot;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Utils {

	public static List<User> generate() {
		log.info(" ------- Utils generate  ------- ");
		List<User> list = Lists.newArrayList();
		int index = 1;
		User user = null;
		do{
			user = new User();
			user.setId(index);
			user.setName(UUID.randomUUID().toString());
			user.setLoginTime(new Date(System.currentTimeMillis()));
			list.add(user);
			index++;
		}while(index<100);
		return list;
	}
	
	public static User single(long id) {
		log.info(" ------- single  ------- "+id);
		User user = new User();
		user.setId(id);
		user.setName(UUID.randomUUID().toString());
		user.setLoginTime(new Date(System.currentTimeMillis()));
		return user;
	}
	
	public static User singleByName(String name) {
		log.info(" ------- single  ------- "+name);
		User user = new User();
		user.setId(666);
		user.setName(name);
		user.setLoginTime(new Date(System.currentTimeMillis()));
		return user;
	}
}
