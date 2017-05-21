package com.boot;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class User implements Serializable {
	
	private static final long serialVersionUID = 2616394620118956887L;

	private long id;
	private String name;
	private Date loginTime;
	
	public User(){}
	
	public User(long id, String name, Date loginTime) {
		this.id = id;
		this.name = name;
		this.loginTime = loginTime;
	}
	
}
