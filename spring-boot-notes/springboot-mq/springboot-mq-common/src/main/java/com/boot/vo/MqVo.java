package com.boot.vo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class MqVo implements Serializable {
	
	private static final long serialVersionUID = 5344818722962892592L;
	private String id;
	private String name;
	private Date createTime;
	
}
