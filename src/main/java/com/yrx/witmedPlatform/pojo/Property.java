package com.yrx.witmedPlatform.pojo;

import java.io.Serializable;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date 2022-01-12
 * @since
 */
public class Property implements Serializable {
	private static final long serialVersionUID = 4996476359919102089L;
	private String type;                        // 数据类型
	private String name;                        // 属性名
	private String comment;                     // 属性注释

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
