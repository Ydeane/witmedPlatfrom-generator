package com.yrx.witmedPlatform.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date 2022-01-12
 * @since
 */
public class Entity implements Serializable {
	private static final long serialVersionUID = 2677759542076397849L;
	private String tableName;                       // 表名
	private String entityName;                      // 实体类类名
	private String comment;
	private List propertyList;                    // 属性集合

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(List propertyList) {
		this.propertyList = propertyList;
	}
}
